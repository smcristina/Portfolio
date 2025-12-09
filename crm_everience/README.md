# Everience CRM - Sistema di Gestione Customer Relationship

## 🎯 Introduzione Progetto

Everience CRM è un sistema di Customer Relationship Management sviluppato per digitalizzare e ottimizzare i processi commerciali di Everience. La piattaforma gestisce l'intero funnel di vendita, dal primo contatto (lead) fino alla stipula del contratto, con un sistema di ruoli differenziati per i vari dipartimenti aziendali. 

### **Funzionalità Principali**
- **Gestione workflow completo**: Lead, Opportunità, Richieste, Contratti
- **Sistema ruoli multipli**: Admin, Commerciale, Service Manager, Recruitment, Marketing
- **Calcolo PNL automatico**: Gestione costi e margini
- **Rubrica centralizzata**: Gestione contatti clienti
- **Permessi differenziati**: Ogni ruolo ha accessi specifici

### **Utenti Finali**
- **Commerciale**: Gestione lead, opportunità, richieste
- **Service Manager**: Gestione richieste e risorse
- **Recruitment**: Gestione candidati e anagrafica interna
- **Marketing**: Accesso a dati CRM
- **Admin**: Gestione sistema completa

## 🛠️ Tecnologie Utilizzate

### **Frontend**
- **React** con TypeScript
- **Material-UI** per componenti UI

### **Backend**
- **Node.js** con Express
- **Firebase Authentication**
- **Firebase Cloud Functions**

### **Database**
- **Microsoft SQL Server**
- **24+ tabelle relazionali**

### **Sicurezza**
- Autenticazione dominio `@everience.com`
- Role-Based Access Control (RBAC)
- JWT per autenticazione

## 👥 Team di Sviluppo

### **Team di 3 Persone**

#### **1. Cristina - Backend Developer & Frontend Support**
**Ruolo**: Sviluppatrice Backend con supporto Frontend  
**Responsabilità principali**:
- Architettura e sviluppo database SQL Server
- Implementazione API RESTful con Node.js/Express
- Business logic per workflow CRM
- Sistema autenticazione Firebase
- Calcoli PNL automatizzati
- Supporto frontend e integrazioni

#### **2. Domenico - Backend Developer & Frontend Support**
**Ruolo**: Sviluppatore Frontend principale

#### **3. Paula - Full Stack Developer**
**Ruolo**: Supporto full stack

## 📁 Struttura Progetto

### **Architettura Database Principale**
```
LEADS → OPPORTUNITY → REQUEST → CLIENT_CONTRACT
```

### **Tabelle Chiave**
1. **LEADS** - Gestione lead commerciali
2. **OPPORTUNITY** - Opportunità di business
3. **REQUEST** - Richieste di servizio
4. **PNL** - Calcoli Profit & Loss
5. **CONTACTS** - Rubrica contatti
6. **USERS** - Utenti sistema con ruoli

### **Componenti Sviluppati**

#### **Sistema Autenticazione**
- Registrazione solo per email `@everience.com`
- Approvazione admin per nuovi utenti
- Recupero password con magic link
- Gestione ruoli: Admin, Commerciale, Service Manager, Recruitment, Marketing

#### **Workflow CRM**
1. **Creazione Lead**: Form con selezione contatti da rubrica
2. **Conversione**: Lead → Opportunità → Richiesta → Contratto
3. **Calcolo PNL**: Sistema automatico costi e margini
4. **Gestione Contratti**: Creazione da richieste con PNL

#### **Permessi per Ruolo**
```javascript
// Esempio controllo accessi
if (user.role === 'commerciale') {
  // Accesso a: lead, opportunità, richieste, rubrica, contratti
} else if (user.role === 'service_manager') {
  // Accesso a: richieste, ricerca dipendenti
}
```

### **Funzionalità Specifiche**

#### **Area Commerciale**
- **Lista Lead**: Filtri per utente e ragione sociale
- **Lista Opportunità**: Conversione a richieste
- **Lista Richieste**: Gestione PNL e contrattualizzazione
- **Rubrica**: CRUD contatti clienti
- **Contratti**: Visualizzazione e archiviazione

#### **Area Service Manager**
- Gestione richieste
- Ricerca dipendenti
- Assegnazione risorse

#### **Area Recruitment**
- Pipe candidati
- Anagrafica interna dipendenti
- Gestione richieste

## 🎓 Il Mio Contributo

### **Sviluppo Backend**
1. **Database Design**
   - Progettazione schema tabelle
   - Relazioni tra lead, opportunità, richieste, contratti
   - Ottimizzazione performance query

2. **API Development**
   - Endpoint per tutte le operazioni CRM
   - Validazione dati input
   - Gestione errori

3. **Business Logic**
   - Workflow Lead→Opportunità→Richiesta→Contratto
   - Calcoli automatici PNL
   - Generazione codici univoci (es: DIR-12-05-23-0001)

4. **Sicurezza**
   - Implementazione RBAC
   - Autenticazione Firebase
   - Validazione dominio email

### **Supporto Frontend**
- Integrazione API con frontend
- Risoluzione bug
- Supporto implementazione funzionalità complesse

### **Risultati**
- Sistema CRM funzionante per Everience
- Gestione completa workflow commerciale
- Sistema ruoli con permessi differenziati
- Automazione calcoli PNL

---

*Progetto sviluppato per Everience*   
*Periodo: maggio 2025 - settembre 2025*
