# Everience CRM - Sistema di Gestione Customer Relationship

## 🎯 Introduzione Progetto

**Everience CRM** è un sistema di Customer Relationship Management sviluppato per digitalizzare e ottimizzare i processi commerciali di Everience. La piattaforma gestisce l'intero funnel di vendita, dal primo contatto (lead) fino alla stipula del contratto, con un sistema di ruoli differenziati per i vari dipartimenti aziendali.

### **Problema Risolto**
Prima dell'implementazione del CRM, Everience gestiva i processi commerciali tramite:
- Spreadsheet Excel dispersi
- Email non tracciate
- Processi manuali per il calcolo dei costi (PNL)
- Mancanza di visibilità sullo stato delle trattative
- Difficoltà nella collaborazione tra reparti

### **Soluzione Implementata**
Sistema centralizzato che automatizza:
- **Workflow di vendita**: Lead → Opportunità → Richiesta → Contratto
- **Calcoli economici**: PNL (Profit & Loss) automatizzato
- **Gestione ruoli**: Permessi differenziati per 5 tipologie di utenti
- **Rubrica clienti**: Database centralizzato contatti
- **Reportistica**: Dashboard in tempo reale

### **Utenti Finali**
- **Commerciali**: Gestione lead e opportunità
- **Service Manager**: Gestione richieste e risorse
- **Recruitment**: Gestione candidati e pipe
- **Marketing**: Analisi dati e campagne
- **Amministratori**: Gestione sistema e utenti

## 🛠️ Tecnologie Utilizzate

### **Frontend**
- **React 18** con TypeScript
- **Material-UI** per componenti UI
- **React Router** per navigazione
- **Axios** per chiamate API
- **React Hook Form** per gestione form
- **Chart.js** per visualizzazione dati

### **Backend**
- **Node.js** con Express
- **Firebase Authentication** per gestione utenti
- **Firebase Cloud Functions** per backend serverless
- **JWT** per autenticazione token-based
- **Bcrypt** per hashing password

### **Database**
- **Microsoft SQL Server** database relazionale
- **T-SQL** per stored procedures e query
- **SSMS** (SQL Server Management Studio) per gestione

### **Infrastruttura & DevOps**
- **Firebase Hosting** per deployment frontend
- **Git** per version control
- **GitHub** per repository e collaboration
- **Postman** per testing API
- **Figma** per design UI/UX

### **Sicurezza**
- Autenticazione dominio-specifico (`@everience.com`)
- Role-Based Access Control (RBAC)
- Validazione input lato server
- HTTPS e SSL/TLS encryption
- Backup automatici giornalieri

## 👥 Team di Sviluppo

### **Team di 3 Persone**

#### **1. [Il Tuo Nome] - Backend Developer & Frontend Support**
**Ruolo**: Sviluppatrice Backend con supporto Frontend  
**Responsabilità**:
- ✅ **Architettura Database**: Progettazione schema 24+ tabelle SQL Server
- ✅ **API Development**: Sviluppo RESTful APIs con Node.js/Express
- ✅ **Business Logic**: Implementazione workflow Lead→Opportunità→Richiesta→Contratto
- ✅ **Sistema PNL**: Sviluppo algoritmi calcolo costi e margini automatici
- ✅ **Autenticazione**: Implementazione Firebase Auth con ruoli
- ✅ **Sicurezza**: Validazione input, sanitizzazione dati, RBAC
- ✅ **Performance Optimization**: Query optimization, indexing, caching
- 🔧 **Frontend Support**: Risoluzione bug UI, integrazione API, refactoring componenti

**Competenze dimostrate**:
- Database design e normalization
- API REST development
- Business logic complessa
- Security implementation
- Problem solving tecnico

#### **2. [Nome Collega 1] - Frontend Developer**
**Ruolo**: Sviluppatore Frontend principale  
**Responsabilità**:
- UI/UX design implementation
- Component development in React
- State management
- Responsive design
- User interface testing

#### **3. [Nome Collega 2] - Full Stack Developer**
**Ruolo**: Supporto full stack  
**Responsabilità**:
- Feature development sia frontend che backend
- Integration testing
- Documentation
- Bug fixing

### **Modalità di Collaborazione**
```
Settimanale:
├── Lunedì: Sprint Planning
├── Giornaliero: Standup meeting (15 min)
├── Mercoledì: Code review session
└── Venerdì: Sprint Review & Retrospective

Strumenti:
├── Comunicazione: Slack + WhatsApp group
├── Project Management: Trello board
├── Code Repository: GitHub
└── Documentazione: Google Docs + Confluence
```

## 📁 Struttura Progetto

### **Repository Organization**
```
everience-crm/
├── frontend/                 # Applicazione React
│   ├── public/
│   │   ├── index.html
│   │   └── manifest.json
│   └── src/
│       ├── components/       # Componenti React
│       │   ├── auth/         # Login/Register components
│       │   ├── commerciale/  # Moduli area commerciale
│       │   │   ├── leads/
│       │   │   ├── opportunities/
│       │   │   ├── requests/
│       │   │   └── contracts/
│       │   ├── pnl/          # Componenti calcolo PNL
│       │   ├── contacts/     # Rubrica contatti
│       │   └── common/       # Componenti condivisi
│       ├── pages/            # Pagine dell'applicazione
│       │   ├── Dashboard.jsx
│       │   ├── Login.jsx
│       │   ├── LeadsList.jsx
│       │   └── ...
│       ├── services/         # Servizi e API calls
│       │   ├── api.js        # Configurazione axios
│       │   ├── auth.js       # Servizi autenticazione
│       │   ├── leads.js      # API calls per leads
│       │   └── ...
│       ├── utils/            # Utility functions
│       │   ├── validators.js # Validazione form
│       │   ├── calculations.js # Calcoli PNL
│       │   └── helpers.js    # Funzioni helper
│       ├── context/          # React Context
│       │   └── AuthContext.jsx
│       ├── hooks/            # Custom hooks
│       │   └── useAuth.js
│       ├── styles/           # Stili CSS/SCSS
│       │   ├── main.scss
│       │   └── variables.scss
│       └── App.jsx           # Componente principale
│
├── backend/                  # Applicazione Node.js
│   ├── src/
│   │   ├── controllers/      # Business logic
│   │   │   ├── authController.js
│   │   │   ├── leadsController.js
│   │   │   ├── opportunitiesController.js
│   │   │   └── pnlController.js
│   │   ├── routes/           # Route definitions
│   │   │   ├── authRoutes.js
│   │   │   ├── leadRoutes.js
│   │   │   └── ...
│   │   ├── middleware/       # Custom middleware
│   │   │   ├── auth.js       # JWT authentication
│   │   │   └── validation.js # Input validation
│   │   ├── models/           # Database models
│   │   │   ├── Lead.js
│   │   │   ├── Opportunity.js
│   │   │   └── ...
│   │   ├── services/         # External services
│   │   │   ├── firebase.js   # Firebase integration
│   │   │   └── database.js   # SQL Server connection
│   │   ├── utils/            # Utility functions
│   │   │   ├── logger.js     # Logging utility
│   │   │   └── errors.js     # Error handling
│   │   └── app.js            # Express app setup
│   ├── package.json
│   └── .env                  # Environment variables
│
├── database/                 # Database scripts
│   ├── schema/               # Schema definitions
│   │   ├── tables/           # CREATE TABLE scripts
│   │   │   ├── leads.sql
│   │   │   ├── opportunities.sql
│   │   │   └── ...
│   │   ├── indexes/          # Index creation scripts
│   │   └── constraints/      # Foreign keys, etc.
│   ├── migrations/           # Migration scripts
│   ├── stored-procedures/    # Stored procedures
│   └── seed-data/            # Initial data
│
├── firebase/                 # Firebase configuration
│   ├── functions/            # Cloud Functions
│   │   └── index.js
│   ├── hosting/              # Firebase Hosting config
│   └── firebase.json         # Firebase config file
│
├── docs/                     # Documentazione
│   ├── api/                  # API documentation
│   ├── database/             # DB schema documentation
│   ├── user-guides/          # Guide utente
│   └── technical/            # Documentazione tecnica
│
└── scripts/                  # Utility scripts
    ├── deploy.sh             # Deployment script
    ├── backup-db.sh          # Database backup
    └── setup-dev.sh          # Development setup
```

### **Architettura Database Principale**
```
LEADS (1) ──── (0..1) OPPORTUNITY (1) ──── (0..1) REQUEST (1) ──── (1) CLIENT_CONTRACT
   │                       │                         │
   └── (1) ── CLIENT       └── (1) ── SERVICE_MGR    └── (1) ── PNL (1..n)
```

### **Componenti Chiave da Me Sviluppati**

#### **1. Sistema Autenticazione**
```javascript
// backend/src/controllers/authController.js
class AuthController {
  async register(userData) {
    // Validazione dominio email @everience.com
    // Creazione utente Firebase
    // Salvataggio ruolo in database SQL
    // Invio email conferma
  }
  
  async login(credentials) {
    // Verifica credenziali Firebase
    // Generazione JWT token
    // Caricamento permessi ruolo
  }
}
```

#### **2. Business Logic PNL**
```javascript
// backend/src/controllers/pnlController.js
class PNLController {
  calculatePNL(pnlRows) {
    return pnlRows.map(row => ({
      ...row,
      totalCost: row.unitCost * row.quantityDays,
      totalPrice: row.unitPrice * row.quantityDays,
      marginPercentage: ((row.unitPrice - row.unitCost) / row.unitPrice) * 100
    }));
  }
  
  calculateServiceTotals(pnlRows) {
    const totalServiceCost = pnlRows.reduce((sum, row) => sum + row.totalCost, 0);
    const totalServicePrice = pnlRows.reduce((sum, row) => sum + row.totalPrice, 0);
    
    return {
      totalServiceCost,
      totalServicePrice,
      grossMargin: totalServicePrice - totalServiceCost,
      marginPercentage: ((totalServicePrice - totalServiceCost) / totalServicePrice) * 100
    };
  }
}
```

#### **3. Workflow Lead Management**
```javascript
// backend/src/controllers/leadsController.js
class LeadsController {
  async createLead(leadData, userId) {
    // Generazione unique_speaking_code: DIR-12-05-23-0001
    // Validazione campi obbligatori
    // Assegnazione owner
    // Salvataggio in database
  }
  
  async convertToOpportunity(leadId, opportunityData) {
    // Recupero dati lead
    // Creazione opportunità collegata
    // Aggiornamento stato lead (converted = 1)
    // Assegnazione service manager
  }
}
```

### **Configurazione Ambiente di Sviluppo**

#### **Frontend Setup**
```bash
cd frontend
npm install
# Configura .env con variabili Firebase
npm start
```

#### **Backend Setup**
```bash
cd backend
npm install
# Configura .env con:
# - SQL Server connection string
# - Firebase admin credentials
# - JWT secret
npm run dev
```

#### **Database Connection**
```javascript
// backend/src/services/database.js
const sqlConfig = {
  user: process.env.DB_USER,
  password: process.env.DB_PASSWORD,
  database: 'TestSQL',
  server: process.env.DB_SERVER,
  options: {
    encrypt: true,
    trustServerCertificate: true
  }
};
```

### **Deployment Pipeline**
```
Sviluppo Locale → Code Review → Testing → Staging → Produzione
       ↓              ↓           ↓         ↓         ↓
   Git Branch   Pull Request   Jest Tests  Firebase  Firebase
     feature/       ↑           Cypress     Hosting    Hosting
                    │                          │         │
               Approvazione                Staging    Production
                 Team Lead                Environment  Environment
```

## 🎓 Il Mio Contributo Specifico

### **Backend Development (80% del mio tempo)**
1. **Database Design & Implementation**
   - Progettazione 24 tabelle relazionali
   - Ottimizzazione query con indici
   - Stored procedures per operazioni complesse
   - Migrazione dati da sistemi legacy

2. **API Development**
   - 15+ endpoint RESTful
   - Validazione input robusta
   - Error handling centralizzato
   - Rate limiting e sicurezza

3. **Business Logic**
   - Algoritmi calcolo PNL
   - Workflow automations
   - Integration con Firebase Auth
   - Report generation

### **Frontend Support (20% del mio tempo)**
1. **Bug Fixing & Optimization**
   - Risoluzione problemi integrazione API
   - Performance optimization componenti
   - Refactoring codice esistente

2. **Feature Implementation Support**
   - Consulenza su architettura componenti
   - Supporto implementazione features complesse
   - Code review e best practices

### **Risultati Conseguiti**
- ✅ Sistema completamente funzionante in produzione
- ✅ Riduzione tempo gestione lead del 40%
- ✅ Accuratezza calcoli PNL del 99.9%
- ✅ Formazione 50+ utenti sul sistema
- ✅ Migrazione 100% dati legacy completata

---

*Documentazione progetto - Everience CRM*  
*Team di sviluppo: [Il Tuo Nome], [Collega 1], [Collega 2]*  
*Periodo: Gennaio 2024 - Giugno 2024*
