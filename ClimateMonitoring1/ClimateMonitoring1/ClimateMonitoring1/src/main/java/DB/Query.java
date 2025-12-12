package DB;

import java.util.*;

import java.sql.*;
import java.io.*;
public class Query {
	
	 
	 public static Connection connect()throws SQLException {
		 String url="jdbc:postgresql://localhost:5432/ClimateMonitoring";
			String username="postgres";
			String password ="Stobene02!";
		            return DriverManager.getConnection(url, username, password);
	 }
	 
	 public static void registrazione(String nome, String cognome, String codicefiscale,String email, String userid,String password) throws SQLException {
		 try {
			 Connection connection = connect();
			 
			 PreparedStatement inserireoper =(PreparedStatement)connection.prepareStatement(SQLstring.inseriscioperatore(nome,cognome,codicefiscale,email,userid,password));
		 inserireoper.setString(1, nome);
		 inserireoper.setString(2, cognome);
		 inserireoper.setString(3,codicefiscale);
		 inserireoper.setString(4, email);
		 inserireoper.setString(5, userid);
		 inserireoper.setString(6, password);
		 inserireoper.executeUpdate();
		 

		 } catch (SQLException e){
			 System.out.println("Error: "+e.getMessage()); 
			 }
	
		 
	 }
	 
	 public  static void registraCentroAree(String userid,String nomeCentro, String via,String numeroCivico, String cap,String comune,String provincia, List<String> areeInteresse) throws SQLException{

		         	
		 try {
			 Connection connection = connect();
		        PreparedStatement st =(PreparedStatement)connection.prepareStatement(SQLstring.inserirecentro(userid,nomeCentro,via,numeroCivico,cap,comune,provincia));
		        st.setString(1,nomeCentro);
		        st.setString(2,via);
		        st.setString(3,numeroCivico);
		        st.setString(4, cap);
		        st.setString(5, comune);
		        st.setString(6, provincia);
		       
		st.executeUpdate();  
		
		       
		       PreparedStatement insertarea =(PreparedStatement)connection.prepareStatement((SQLstring.inserisciearea()));
		       for(String area: areeInteresse) {
		       insertarea.setString(1,nomeCentro);
		        insertarea.setString(2,area);
		        insertarea.executeUpdate();
		        String sql = "UPDATE OperatoriRegistrati SET idCentroMonitoraggio = ? WHERE userid =?";
		        PreparedStatement stmt = connection.prepareStatement(sql);
		        stmt.setString(1, nomeCentro); 
		        stmt.setString(2,userid);
		        stmt.executeUpdate();
		        
		       }} catch (SQLException e){
		 System.out.println("Error: "+e.getMessage()); 
		 }
		    
		  

		 

		 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static  ArrayList<String> ricercarecoordinate(String coordinate) throws SQLException {
			
		ArrayList<String> citta= new ArrayList <>();
		        

	 try (Connection connection = connect()){
	 try {
	PreparedStatement st = connection.prepareStatement(SQLstring.ricercacoordinate(coordinate));
		        st.setString(1,coordinate);
		      
		        ResultSet  re1=st.executeQuery();
		      
		       while(re1.next()){
		          ArrayList<String> rowData= new ArrayList<>();
		        rowData.add(re1.getString("Name"));
		        rowData.add(re1.getString("coordinate")); 
		         citta.addAll(rowData);
		       
		        
		       }
		        
		        
		        
		         } catch (SQLException ex){
		       System.out.println(ex);
		       }
		   return citta;}  
	 }

	public static  Vector<Vector<String>> ricercarecountrycode(String searchcode) throws SQLException {
		
		 Vector<Vector<String>> citta= new Vector <>();
		        

	 try (Connection connection = connect()){
	 try {
	PreparedStatement st = connection.prepareStatement(SQLstring.ricercacountrycode(searchcode));
		        st.setString(1,searchcode);
		      
		        ResultSet  re1=st.executeQuery();
		      
		       while(re1.next()){
		          Vector<String>rowData= new Vector<>();
		        rowData.add(re1.getString("Name"));
		        rowData.add(re1.getString("countrycode")); 
		         citta.add(rowData);
		       
		        
		       }
		       
		        
		        
		        
		         } catch (SQLException ex){
		       System.out.println(ex);
		       }
		   return citta;}   
	
	
}
}
