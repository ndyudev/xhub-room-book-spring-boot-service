# 🚀 Quick Setup Guide

## 📋 Prerequisites
- Java 17 or higher
- Maven 3.9.5 or higher
- MySQL 8.0 or higher
- Git

## ⚡ Quick Start

### 1. Clone the repository
```bash
git clone https://github.com/your-username/room-book.git
cd room-book/room-book
```

### 2. Setup Database
```sql
-- Create database
CREATE DATABASE room_booking_db;
USE room_booking_db;

-- Run the SQL script from README.md to create tables
```

### 3. Configure Application
```bash
# Copy local configuration template
cp src/main/resources/application-local.yml src/main/resources/application-local.yml

# Edit with your database credentials
nano src/main/resources/application-local.yml
```

Update the following in `application-local.yml`:
```yaml
spring:
  datasource:
    username: your_mysql_username
    password: your_mysql_password
```

### 4. Run the Application
```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

### 5. Access the Application
- **Backend API**: http://localhost:8080
- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **Frontend**: Open `frontend/index.html` in your browser

## 🔧 Configuration Profiles

| Profile | Description | Usage |
|---------|-------------|-------|
| `local` | Local development | Default for development |
| `dev` | Development environment | Team development |
| `test` | Testing environment | Automated tests |
| `prod` | Production environment | Live deployment |

## 🐛 Troubleshooting

### Database Connection Issues
```bash
# Check MySQL service
sudo systemctl status mysql

# Test connection
mysql -u username -p -h localhost
```

### Port Already in Use
```bash
# Find process using port 8080
lsof -i :8080

# Kill process
kill -9 <PID>
```

### Maven Build Issues
```bash
# Clean and rebuild
mvn clean install -U

# Check Java version
java -version
```

## 📚 Next Steps
1. Read the full [README.md](README.md) for detailed documentation
2. Explore the API using Swagger UI
3. Test the frontend interface
4. Customize the application for your needs

## 🤝 Need Help?
- Check the [README.md](README.md) for detailed documentation
- Open an issue on GitHub
- Contact the maintainer 