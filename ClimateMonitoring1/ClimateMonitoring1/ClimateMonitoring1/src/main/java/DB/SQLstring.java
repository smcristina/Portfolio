package DB;

import java.sql.SQLException;
import java.util.List;

public class SQLstring {

	
	public static String ricercacountrycode(String country) {
		
		String countrycode="SELECT * from coordinatemonitoraggio WHERE countrycode=? ";
		return countrycode;
		
	}
    public static String ricercacoordinate(String coordinate) {
		String riccoordinate="SELECT * from coordinatemonitoraggio WHERE coordinate=? ";
		return riccoordinate ;
	
}
    public static String inserirecentro(String userid,String nomeCentro, String via,String numeroCivico, String cap,String comune,String provincia) {
    String centro= "INSERT INTO CentriMonitoraggio(nomecentro,via,numerocivico,cap,comune,provincia)VALUES(?,?,?,?,?,?)";
        return 	centro;
}
    
    
	public static String inserisciearea() {
		String area=" INSERT INTO AreeInteresse(centroid,area) VALUES(?,?)";
    	return area;
		
	}
	
	
	public static String inseriscioperatore(String nome, String cognome, String codicefiscale, String email,
			String userid, String password) {
		// TODO Auto-generated method stub
		String operatore=" INSERT INTO OperatoriRegistrati(nome,cognome,codicefiscale,postaelet,userid,password) VALUES(?,?,?,?,?,?)";
    	return operatore;
	
	}
}