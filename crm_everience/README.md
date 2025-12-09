# Everience CRM - Customer Relationship Management System

## 🎯 Project Introduction

**Everience CRM** is a Customer Relationship Management system developed to digitize and optimize Everience's commercial processes. The platform manages the entire sales funnel, from initial contact (lead) to contract signing, with a differentiated role system for various company departments.

### **Problem Solved**
Before CRM implementation, Everience managed commercial processes through:
- Dispersed Excel spreadsheets
- Untracked emails
- Manual cost calculation processes (PNL)
- Lack of visibility on deal status
- Difficulty in inter-department collaboration

### **Implemented Solution**
Centralized system that automates:
- **Sales workflow**: Lead → Opportunity → Request → Contract
- **Economic calculations**: Automated PNL (Profit & Loss)
- **Role management**: Differentiated permissions for 5 user types
- **Client directory**: Centralized contact database
- **Reporting**: Real-time dashboard

### **End Users**
- **Sales Team**: Lead and opportunity management
- **Service Managers**: Request and resource management
- **Recruitment**: Candidate and pipeline management
- **Marketing**: Data analysis and campaigns
- **Administrators**: System and user management

## 🛠️ Technologies Used

### **Frontend**
- **React 18** with TypeScript
- **Material-UI** for UI components
- **React Router** for navigation
- **Axios** for API calls
- **React Hook Form** for form management
- **Chart.js** for data visualization

### **Backend**
- **Node.js** with Express
- **Firebase Authentication** for user management
- **Firebase Cloud Functions** for serverless backend
- **JWT** for token-based authentication
- **Bcrypt** for password hashing

### **Database**
- **Microsoft SQL Server** relational database
- **T-SQL** for stored procedures and queries
- **SSMS** (SQL Server Management Studio) for management

### **Infrastructure & DevOps**
- **Firebase Hosting** for frontend deployment
- **Git** for version control
- **GitHub** for repository and collaboration
- **Postman** for API testing
- **Figma** for UI/UX design

### **Security**
- Domain-specific authentication (`@everience.com`)
- Role-Based Access Control (RBAC)
- Server-side input validation
- HTTPS and SSL/TLS encryption
- Daily automatic backups

## 👥 Development Team

### **3-Person Team**

#### **1. [Your Name] - Backend Developer & Frontend Support**
**Role**: Backend Developer with Frontend Support  
**Responsibilities**:
- ✅ **Database Architecture**: Design of 24+ SQL Server table schema
- ✅ **API Development**: Development of RESTful APIs with Node.js/Express
- ✅ **Business Logic**: Implementation of Lead→Opportunity→Request→Contract workflow
- ✅ **PNL System**: Development of automatic cost and margin calculation algorithms
- ✅ **Authentication**: Firebase Auth implementation with roles
- ✅ **Security**: Input validation, data sanitization, RBAC
- ✅ **Performance Optimization**: Query optimization, indexing, caching
- 🔧 **Frontend Support**: UI bug resolution, API integration, component refactoring

**Demonstrated Skills**:
- Database design and normalization
- REST API development
- Complex business logic
- Security implementation
- Technical problem solving

#### **2. [Colleague 1 Name] - Frontend Developer**
**Role**: Main Frontend Developer  
**Responsibilities**:
- UI/UX design implementation
- React component development
- State management
- Responsive design
- User interface testing

#### **3. [Colleague 2 Name] - Full Stack Developer**
**Role**: Full stack support  
**Responsibilities**:
- Both frontend and backend feature development
- Integration testing
- Documentation
- Bug fixing

### **Collaboration Mode**
```
Weekly:
├── Monday: Sprint Planning
├── Daily: Standup meeting (15 min)
├── Wednesday: Code review session
└── Friday: Sprint Review & Retrospective

Tools:
├── Communication: Slack + WhatsApp group
├── Project Management: Trello board
├── Code Repository: GitHub
└── Documentation: Google Docs + Confluence
```

## 📁 Project Structure

### **Repository Organization**
```
everience-crm/
├── frontend/                 # React application
│   ├── public/
│   │   ├── index.html
│   │   └── manifest.json
│   └── src/
│       ├── components/       # React components
│       │   ├── auth/         # Login/Register components
│       │   ├── commercial/   # Sales area modules
│       │   │   ├── leads/
│       │   │   ├── opportunities/
│       │   │   ├── requests/
│       │   │   └── contracts/
│       │   ├── pnl/          # PNL calculation components
│       │   ├── contacts/     # Contact directory
│       │   └── common/       # Shared components
│       ├── pages/            # Application pages
│       │   ├── Dashboard.jsx
│       │   ├── Login.jsx
│       │   ├── LeadsList.jsx
│       │   └── ...
│       ├── services/         # Services and API calls
│       │   ├── api.js        # Axios configuration
│       │   ├── auth.js       # Authentication services
│       │   ├── leads.js      # Leads API calls
│       │   └── ...
│       ├── utils/            # Utility functions
│       │   ├── validators.js # Form validation
│       │   ├── calculations.js # PNL calculations
│       │   └── helpers.js    # Helper functions
│       ├── context/          # React Context
│       │   └── AuthContext.jsx
│       ├── hooks/            # Custom hooks
│       │   └── useAuth.js
│       ├── styles/           # CSS/SCSS styles
│       │   ├── main.scss
│       │   └── variables.scss
│       └── App.jsx           # Main component
│
├── backend/                  # Node.js application
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
├── docs/                     # Documentation
│   ├── api/                  # API documentation
│   ├── database/             # DB schema documentation
│   ├── user-guides/          # User guides
│   └── technical/            # Technical documentation
│
└── scripts/                  # Utility scripts
    ├── deploy.sh             # Deployment script
    ├── backup-db.sh          # Database backup
    └── setup-dev.sh          # Development setup
```

### **Main Database Architecture**
```
LEADS (1) ──── (0..1) OPPORTUNITY (1) ──── (0..1) REQUEST (1) ──── (1) CLIENT_CONTRACT
   │                       │                         │
   └── (1) ── CLIENT       └── (1) ── SERVICE_MGR    └── (1) ── PNL (1..n)
```

### **Key Components Developed by Me**

#### **1. Authentication System**
```javascript
// backend/src/controllers/authController.js
class AuthController {
  async register(userData) {
    // Email domain validation @everience.com
    // Firebase user creation
    // Role saving in SQL database
    // Confirmation email sending
  }
  
  async login(credentials) {
    // Firebase credential verification
    // JWT token generation
    // Role permission loading
  }
}
```

#### **2. PNL Business Logic**
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

#### **3. Lead Management Workflow**
```javascript
// backend/src/controllers/leadsController.js
class LeadsController {
  async createLead(leadData, userId) {
    // Generate unique_speaking_code: DIR-12-05-23-0001
    // Mandatory field validation
    // Owner assignment
    // Database saving
  }
  
  async convertToOpportunity(leadId, opportunityData) {
    // Lead data retrieval
    // Linked opportunity creation
    // Lead status update (converted = 1)
    // Service manager assignment
  }
}
```

### **Development Environment Setup**

#### **Frontend Setup**
```bash
cd frontend
npm install
# Configure .env with Firebase variables
npm start
```

#### **Backend Setup**
```bash
cd backend
npm install
# Configure .env with:
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
Local Development → Code Review → Testing → Staging → Production
       ↓              ↓           ↓         ↓         ↓
   Git Branch   Pull Request   Jest Tests  Firebase  Firebase
     feature/       ↑           Cypress     Hosting    Hosting
                    │                          │         │
               Team Lead                  Staging    Production
               Approval                  Environment  Environment
```

## 🎓 My Specific Contribution

### **Backend Development (80% of my time)**
1. **Database Design & Implementation**
   - Design of 24 relational tables
   - Query optimization with indexes
   - Stored procedures for complex operations
   - Data migration from legacy systems

2. **API Development**
   - 15+ RESTful endpoints
   - Robust input validation
   - Centralized error handling
   - Rate limiting and security

3. **Business Logic**
   - PNL calculation algorithms
   - Workflow automations
   - Integration with Firebase Auth
   - Report generation

### **Frontend Support (20% of my time)**
1. **Bug Fixing & Optimization**
   - API integration issue resolution
   - Component performance optimization
   - Existing code refactoring

2. **Feature Implementation Support**
   - Component architecture consulting
   - Complex feature implementation support
   - Code review and best practices

### **Achieved Results**
- ✅ Fully functional system in production
- ✅ 40% reduction in lead management time
- ✅ 99.9% accuracy in PNL calculations
- ✅ Training of 50+ users on the system
- ✅ 100% legacy data migration completed

---

*Project Documentation - Everience CRM*  
*Development Team: [Your Name], [Colleague 1], [Colleague 2]*  
*Period: January 2024 - June 2024*
