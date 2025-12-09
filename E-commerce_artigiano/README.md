# Artigianato Online - Piattaforma E-Commerce per Prodotti Artigianali

## 🎯 Introduzione Progetto

**Artigianato Online** è una piattaforma e-commerce che connette artigiani locali con clienti interessati a prodotti handmade. Gli artigiani possono gestire i propri prodotti e ordini, mentre i clienti possono navigare il catalogo e effettuare acquisti.

### **Funzionalità Principali**
- Registrazione e login per artigiani e clienti
- Catalogo prodotti con filtri
- Sistema carrello e checkout
- Gestione ordini
- Dashboard artigiani

## 🛠️ Tecnologie Utilizzate

### **Backend**
- **Node.js** con Express
- **PostgreSQL** database
- **JWT** per autenticazione
- **Bcrypt** per hashing password
- **Nodemailer** per email

### **Frontend**
- HTML, CSS, JavaScript
- File statici serviti da Express

### **Infrastruttura**
- Docker per containerizzazione
- GitHub per version control

## 👥 Il Mio Ruolo

### **Sviluppo Backend Completo**
Ho sviluppato l'intero backend del sistema da zero, configurando manualmente ogni componente senza utilizzare scaffolding tools.

**Mie Responsabilità**:
- ✅ **Architettura Server**: Configurazione Express.js manuale
- ✅ **Database**: Design schema PostgreSQL e connessione
- ✅ **API RESTful**: Sviluppo endpoint per tutte le funzionalità
- ✅ **Autenticazione**: Sistema JWT con ruoli (artigiano, cliente, admin)
- ✅ **Business Logic**: Logica carrello, ordini, gestione prodotti
- ✅ **Sicurezza**: Validazione input, hashing password, middleware protezione

## 📁 Struttura Progetto

### **Backend Structure**
```
backend/
├── app.js                    # Server principale
├── db.js                     # Connessione database
├── middleware/
│   └── auth.js              # Middleware autenticazione
├── routes/
│   ├── auth.js              # Autenticazione utenti
│   ├── product.js           # Gestione prodotti
│   ├── order.js             # Gestione ordini
│   ├── cart.js              # Gestione carrello
│   └── payment.js           # Gestione pagamenti
└── package.json
```

### **Database Schema**
```sql
-- Tabelle principali
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(30) UNIQUE NOT NULL,
    password VARCHAR(60) NOT NULL,
    role VARCHAR(30) NOT NULL CHECK (role IN ('artigiano', 'cliente', 'admin'))
);

CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    description VARCHAR(100),
    price DECIMAL(10,2) NOT NULL,
    artigiano_id INTEGER REFERENCES users(id)
);

CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    user_id INTEGER REFERENCES users(id),
    product_id INTEGER REFERENCES products(id),
    quantity INTEGER NOT NULL
);
```

## 🔧 Componenti Sviluppati

### **1. Sistema Autenticazione**
```javascript
// Middleware JWT personalizzato
const authenticateToken = (req, res, next) => {
  const token = req.headers['authorization']?.split(' ')[1];
  if (!token) return res.status(401).json({ error: 'Accesso negato' });
  
  jwt.verify(token, process.env.JWT_SECRET, (err, user) => {
    if (err) return res.status(403).json({ error: 'Token non valido' });
    req.user = user;
    next();
  });
};
```

### **2. API Endpoints**
Ho sviluppato tutti gli endpoint necessari:

#### **Autenticazione**
- `POST /api/auth/register` - Registrazione nuovi utenti
- `POST /api/auth/login` - Login con generazione JWT
- `POST /api/auth/logout` - Logout utente

#### **Prodotti**
- `GET /api/product/catalogoProdotti` - Lista prodotti
- `POST /api/product/creazioneProdotto` - Creazione prodotto (solo artigiani)
- `PUT /api/product/:id` - Modifica prodotto
- `DELETE /api/product/:id` - Elimina prodotto

#### **Carrello**
- `POST /api/cart/add` - Aggiungi al carrello
- `GET /api/cart/:user_id` - Visualizza carrello
- `PUT /api/cart/update/:item_id` - Aggiorna quantità
- `DELETE /api/cart/remove/:id` - Rimuovi item

#### **Ordini**
- `POST /api/order/Order` - Crea ordine
- `GET /api/order/Order/:user_id` - Lista ordini utente

### **3. Business Logic**
- Gestione stock prodotti
- Calcolo totali ordini
- Validazione disponibilità
- Aggiornamento quantità in tempo reale

### **4. Configurazione Database**
```javascript
// Configurazione connessione PostgreSQL
const pool = new Pool({
  user: process.env.DB_USER,
  host: process.env.DB_HOST,
  database: process.env.DB_NAME,
  password: process.env.DB_PASSWORD,
  port: process.env.DB_PORT,
});
```

## 🚀 Setup e Deployment

### **Installazione Locale**
```bash
# Clona repository
git clone https://github.com/tuo-username/artigianato-online.git
cd artigianato-online/backend

# Installa dipendenze
npm install

# Configura .env
cp .env.example .env
# Modifica con le tue credenziali

# Avvia server
node app.js
```

### **Configurazione .env**
```env
DB_USER=tuo_user
DB_HOST=localhost
DB_NAME=artigianato_online
DB_PASSWORD=tua_password
DB_PORT=5432
JWT_SECRET=tua_chiave_segreta
PORT=3000
```

## 🎓 Il Mio Contributo

### **Backend Development (100%)**
Ho sviluppato interamente il backend del sistema:

1. **Server Configuration**
   - Setup manuale Express.js senza scaffolding
   - Configurazione middleware (CORS, body parsing, logging)
   - Gestione errori centralizzata

2. **Database Implementation**
   - Design schema PostgreSQL con relazioni
   - Connection pooling per performance
   - Query parameterizzate per sicurezza

3. **API Development**
   - 15+ endpoint RESTful documentati
   - Validazione input per tutti i form
   - Gestione errori con messaggi utente-friendly

4. **Security Implementation**
   - Password hashing con bcrypt
   - JWT token authentication
   - Role-based access control
   - Input sanitization

5. **Business Logic**
   - Sistema carrello con gestione quantità
   - Processo checkout e creazione ordini
   - Gestione inventario in tempo reale
   - Calcolo automatico totali

### **Risultati Consegnati**
- ✅ Sistema e-commerce completamente funzionante
- ✅ API documentate e testate
- ✅ Database ottimizzato e sicuro
- ✅ Sistema autenticazione robusto
- ✅ Codice pulito e manutenibile

### **Competenze Dimostrate**
- Architettura RESTful API
- Database design e optimization
- Sicurezza web e autenticazione
- Business logic development
- Problem solving e debugging

---

*Progetto: Artigianato Online*  
*Sviluppatore Backend: Cristina*  
*Tecnologie: Node.js, Express, PostgreSQL, JWT*  
*Periodo: maggio 2025*
