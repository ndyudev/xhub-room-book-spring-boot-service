# 🏨 XHub Room Booking System

<div align="center">

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)

**Hệ thống quản lý đặt phòng học hiện đại với Spring Boot**

[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/your-username)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/your-profile)

</div>

---

## 📖 Giới thiệu

**XHub Room Booking System** là một ứng dụng web hoàn chỉnh được xây dựng bằng Spring Boot, cung cấp giải pháp quản lý đặt phòng khách sạn hiện đại và hiệu quả. Dự án này kết hợp backend mạnh mẽ với frontend responsive để tạo ra trải nghiệm người dùng tuyệt vời.

### 🎯 Tính năng chính
- ✅ **Quản lý phòng**: Thêm, sửa, xóa, tìm kiếm phòng
- ✅ **Quản lý khách hàng**: Hồ sơ khách hàng chi tiết
- ✅ **Đặt phòng**: Quy trình đặt phòng đơn giản và nhanh chóng
- ✅ **Quản lý hóa đơn**: Tạo và quản lý hóa đơn tự động
- ✅ **API RESTful**: API đầy đủ cho frontend và mobile apps
- ✅ **Frontend CRUD**: Giao diện quản lý trực quan
- ✅ **Swagger UI**: Tài liệu API tự động

### 🏗️ Kiến trúc hệ thống
- **Backend**: Spring Boot với RESTful API
- **Database**: MySQL với JPA/Hibernate
- **Frontend**: HTML, CSS, JavaScript thuần
- **Security**: Spring Security với CORS support
- **Documentation**: Swagger/OpenAPI 3.0

---

## 📊 Trạng thái dự án

<div align="center">

| Module | Trạng thái | Mô tả |
|--------|------------|-------|
| **Backend API** | ✅ **Hoàn thành** | Spring Boot RESTful API |
| **Database** | ✅ **Hoàn thành** | MySQL schema & entities |
| **Frontend CRUD** | ✅ **Hoàn thành** | HTML/CSS/JS interface |
| **Security** | ✅ **Hoàn thành** | CORS & authentication |
| **Documentation** | ✅ **Hoàn thành** | Swagger UI |
| **Deployment** | 🔄 **Đang phát triển** | Docker & cloud ready |

**Tổng tiến độ: 5/6 (83.3%)**

</div>

---

## 📁 Cấu trúc dự án

```
room-book/
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/com/xhub/room_book/
│   │   │   ├── 📁 Config/
│   │   │   │   └── SecurityConfig.java ✅
│   │   │   ├── 📁 Controller/
│   │   │   │   ├── BillController.java ✅
│   │   │   │   ├── BookingController.java ✅
│   │   │   │   ├── CustomerController.java ✅
│   │   │   │   ├── RoomController.java ✅
│   │   │   │   ├── RoomTypeController.java ✅
│   │   │   │   └── UserController.java ✅
│   │   │   ├── 📁 DTO/
│   │   │   │   ├── BillDTO.java ✅
│   │   │   │   ├── BookingDTO.java ✅
│   │   │   │   ├── CustomerDTO.java ✅
│   │   │   │   ├── RoomDTO.java ✅
│   │   │   │   ├── RoomTypeDTO.java ✅
│   │   │   │   └── UserDTO.java ✅
│   │   │   ├── 📁 Entity/
│   │   │   │   ├── Bill.java ✅
│   │   │   │   ├── Booking.java ✅
│   │   │   │   ├── Customer.java ✅
│   │   │   │   ├── Room.java ✅
│   │   │   │   ├── RoomType.java ✅
│   │   │   │   └── User.java ✅
│   │   │   ├── 📁 Repository/
│   │   │   │   ├── BillRepository.java ✅
│   │   │   │   ├── BookingRepository.java ✅
│   │   │   │   ├── CustomerRepository.java ✅
│   │   │   │   ├── RoomRepository.java ✅
│   │   │   │   ├── RoomTypeRepository.java ✅
│   │   │   │   └── UserRepository.java ✅
│   │   │   ├── 📁 Service/
│   │   │   │   ├── 📁 Implements/
│   │   │   │   │   ├── BillServiceImpl.java ✅
│   │   │   │   │   ├── BookingServiceImpl.java ✅
│   │   │   │   │   ├── CustomerServiceImpl.java ✅
│   │   │   │   │   ├── RoomServiceImpl.java ✅
│   │   │   │   │   ├── RoomTypeServiceImpl.java ✅
│   │   │   │   │   └── UserServiceImpl.java ✅
│   │   │   │   ├── BillService.java ✅
│   │   │   │   ├── BookingService.java ✅
│   │   │   │   ├── CustomerService.java ✅
│   │   │   │   ├── RoomService.java ✅
│   │   │   │   ├── RoomTypeService.java ✅
│   │   │   │   └── UserService.java ✅
│   │   │   ├── 📁 Mapper/
│   │   │   │   ├── BillMapper.java ✅
│   │   │   │   ├── BookingMapper.java ✅
│   │   │   │   └── UserMapper.java ✅
│   │   │   ├── 📁 Exception/
│   │   │   │   ├── GlobalExceptionHandler.java ✅
│   │   │   │   ├── NotFoundException.java ✅
│   │   │   │   └── ResourceNotFoundException.java ✅
│   │   │   ├── OpenApiConfig.java ✅
│   │   │   └── RoomBookApplication.java ✅
│   │   └── 📁 resources/
│   │       ├── application.yml ✅
│   │       ├── application-dev.yml ✅
│   │       ├── application-prod.yml ✅
│   │       └── application-test.yml ✅
│   └── 📁 test/
│       └── RoomBookApplicationTests.java ✅
├── 📁 frontend/
│   ├── index.html ✅
│   ├── style.css ✅
│   └── script.js ✅
├── pom.xml ✅
└── README.md ✅
```

---

## 🛠️ Công nghệ sử dụng

### 🚀 Backend Technologies
| Technology | Version | Mục đích |
|------------|---------|----------|
| ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white) | 3.2.0 | Framework chính |
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white) | 17+ | Ngôn ngữ lập trình |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apache-maven&logoColor=white) | 3.9.5 | Build tool |
| ![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=flat&logo=spring&logoColor=white) | 3.2.0 | ORM framework |
| ![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=flat&logo=spring-security&logoColor=white) | 6.2.0 | Security framework |
| ![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white) | 8.0+ | Database |

### 🎨 Frontend Technologies
| Technology | Version | Mục đích |
|------------|---------|----------|
| ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white) | HTML5 | Cấu trúc trang web |
| ![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white) | CSS3 | Styling và layout |
| ![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black) | ES6+ | Tương tác và API calls |
| ![Bootstrap](https://img.shields.io/badge/Bootstrap-7952B3?style=flat&logo=bootstrap&logoColor=white) | 5.3+ | CSS framework |

### 🛠️ Development Tools
| Tool | Mục đích |
|------|----------|
| ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat&logo=intellij-idea&logoColor=white) | IDE chính |
| ![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=flat&logo=visual-studio-code&logoColor=white) | Code editor |
| ![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white) | Version control |
| ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=flat&logo=postman&logoColor=white) | API testing |

### 📚 Libraries & Dependencies
| Library | Version | Mục đích |
|---------|---------|----------|
| ![MapStruct](https://img.shields.io/badge/MapStruct-000000?style=flat&logo=mapstruct&logoColor=white) | 1.5.5 | Object mapping |
| ![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=flat&logo=swagger&logoColor=white) | 2.2.0 | API documentation |
| ![Lombok](https://img.shields.io/badge/Lombok-000000?style=flat&logo=lombok&logoColor=white) | 1.18.30 | Code generation |

---

## 🚀 Hướng dẫn cài đặt và chạy

### 📋 Yêu cầu hệ thống
- **Java**: JDK 17 hoặc cao hơn
- **Maven**: 3.9.5 hoặc cao hơn
- **MySQL**: 8.0 hoặc cao hơn
- **Git**: Để clone repository

### 🔧 Cài đặt

#### 1. Clone repository
```bash
git clone https://github.com/your-username/room-book.git
cd room-book/room-book
```

#### 2. Cấu hình database
```sql
-- Tạo database
CREATE DATABASE room_booking_db;
USE room_booking_db;

-- Tạo bảng users
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    role VARCHAR(20) DEFAULT 'USER',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Tạo bảng room_types
CREATE TABLE room_types (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price_per_night DECIMAL(10,2) NOT NULL,
    capacity INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Tạo bảng rooms
CREATE TABLE rooms (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    room_number VARCHAR(20) UNIQUE NOT NULL,
    room_type_id BIGINT NOT NULL,
    status ENUM('AVAILABLE', 'OCCUPIED', 'MAINTENANCE') DEFAULT 'AVAILABLE',
    floor_number INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (room_type_id) REFERENCES room_types(id)
);

-- Tạo bảng customers
CREATE TABLE customers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20),
    address TEXT,
    id_card VARCHAR(20) UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Tạo bảng bookings
CREATE TABLE bookings (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id BIGINT NOT NULL,
    room_id BIGINT NOT NULL,
    check_in_date DATE NOT NULL,
    check_out_date DATE NOT NULL,
    total_amount DECIMAL(10,2) NOT NULL,
    status ENUM('PENDING', 'CONFIRMED', 'CHECKED_IN', 'CHECKED_OUT', 'CANCELLED') DEFAULT 'PENDING',
    notes TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    FOREIGN KEY (room_id) REFERENCES rooms(id)
);

-- Tạo bảng bills
CREATE TABLE bills (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    booking_id BIGINT NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    tax_amount DECIMAL(10,2) DEFAULT 0.00,
    total_amount DECIMAL(10,2) NOT NULL,
    payment_status ENUM('PENDING', 'PAID', 'CANCELLED') DEFAULT 'PENDING',
    payment_method VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (booking_id) REFERENCES bookings(id)
);
```

#### 3. Cấu hình application
Chỉnh sửa file `src/main/resources/application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/room_booking_db?useSSL=false&serverTimezone=UTC
    username: your_username
    password: your_password
    driver-class-name: com.mysql.cj.jdbc.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQL8Dialect
        format_sql: true

server:
  port: 8080

logging:
  level:
    com.xhub.room_book: DEBUG
    org.springframework.web: DEBUG
```

#### 4. Build và chạy ứng dụng
```bash
# Build project
mvn clean install

# Chạy ứng dụng
mvn spring-boot:run
```

#### 5. Truy cập ứng dụng
- **Backend API**: http://localhost:8080
- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **Frontend**: Mở file `frontend/index.html` trong trình duyệt

---

## 📚 API Documentation

### 🔗 Base URL
```
http://localhost:8080/api/v1
```

### 📋 Endpoints

#### 👥 Users
| Method | Endpoint | Mô tả |
|--------|----------|-------|
| `GET` | `/users` | Lấy danh sách users |
| `GET` | `/users/{id}` | Lấy user theo ID |
| `POST` | `/users` | Tạo user mới |
| `PUT` | `/users/{id}` | Cập nhật user |
| `DELETE` | `/users/{id}` | Xóa user |

#### 🏠 Rooms
| Method | Endpoint | Mô tả |
|--------|----------|-------|
| `GET` | `/rooms` | Lấy danh sách phòng |
| `GET` | `/rooms/{id}` | Lấy phòng theo ID |
| `POST` | `/rooms` | Tạo phòng mới |
| `PUT` | `/rooms/{id}` | Cập nhật phòng |
| `DELETE` | `/rooms/{id}` | Xóa phòng |

#### 🏷️ Room Types
| Method | Endpoint | Mô tả |
|--------|----------|-------|
| `GET` | `/room-types` | Lấy danh sách loại phòng |
| `GET` | `/room-types/{id}` | Lấy loại phòng theo ID |
| `POST` | `/room-types` | Tạo loại phòng mới |
| `PUT` | `/room-types/{id}` | Cập nhật loại phòng |
| `DELETE` | `/room-types/{id}` | Xóa loại phòng |

#### 👤 Customers
| Method | Endpoint | Mô tả |
|--------|----------|-------|
| `GET` | `/customers` | Lấy danh sách khách hàng |
| `GET` | `/customers/{id}` | Lấy khách hàng theo ID |
| `POST` | `/customers` | Tạo khách hàng mới |
| `PUT` | `/customers/{id}` | Cập nhật khách hàng |
| `DELETE` | `/customers/{id}` | Xóa khách hàng |

#### 📅 Bookings
| Method | Endpoint | Mô tả |
|--------|----------|-------|
| `GET` | `/bookings` | Lấy danh sách đặt phòng |
| `GET` | `/bookings/{id}` | Lấy đặt phòng theo ID |
| `POST` | `/bookings` | Tạo đặt phòng mới |
| `PUT` | `/bookings/{id}` | Cập nhật đặt phòng |
| `DELETE` | `/bookings/{id}` | Xóa đặt phòng |

#### 💰 Bills
| Method | Endpoint | Mô tả |
|--------|----------|-------|
| `GET` | `/bills` | Lấy danh sách hóa đơn |
| `GET` | `/bills/{id}` | Lấy hóa đơn theo ID |
| `POST` | `/bills` | Tạo hóa đơn mới |
| `PUT` | `/bills/{id}` | Cập nhật hóa đơn |
| `DELETE` | `/bills/{id}` | Xóa hóa đơn |

---

## 🎨 Frontend Features

### 📱 Giao diện quản lý
- **Tabbed Navigation**: Chuyển đổi giữa các module
- **CRUD Operations**: Thêm, sửa, xóa, tìm kiếm
- **Responsive Design**: Tương thích mobile và desktop
- **Modal Dialogs**: Form thêm/sửa và xác nhận xóa
- **Real-time Search**: Tìm kiếm ngay lập tức
- **Data Validation**: Kiểm tra dữ liệu đầu vào

### 🎯 Modules
1. **🏠 Quản lý phòng**: Thêm, sửa, xóa phòng
2. **👤 Quản lý khách hàng**: Hồ sơ khách hàng
3. **📅 Quản lý đặt phòng**: Đặt phòng và lịch trình
4. **🏷️ Loại phòng**: Quản lý các loại phòng khác nhau

---

## 🔒 Security & CORS

### 🛡️ Spring Security Configuration
```java
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors(cors -> cors.configurationSource(corsConfigurationSource()))
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/swagger-ui/**", "/v3/api-docs/**", "/api/**").permitAll()
                .anyRequest().authenticated()
            );
        return http.build();
    }
    
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOriginPatterns(Arrays.asList("*"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(Arrays.asList("*"));
        configuration.setAllowCredentials(true);
        
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
```

### 🌐 CORS Support
- **Allowed Origins**: Tất cả origins (development)
- **Allowed Methods**: GET, POST, PUT, DELETE, OPTIONS
- **Allowed Headers**: Tất cả headers
- **Credentials**: Enabled

---

## 🚀 Deployment Options

### 🐳 Docker Deployment
```dockerfile
# Dockerfile
FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

```yaml
# docker-compose.yml
version: '3.8'
services:
  app:
    build: .
    ports:
      - "8080:8080"
    environment:
      - SPRING_PROFILES_ACTIVE=prod
    depends_on:
      - mysql
  
  mysql:
    image: mysql:8.0
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: room_booking_db
    ports:
      - "3306:3306"
    volumes:
      - mysql_data:/var/lib/mysql

volumes:
  mysql_data:
```

### ☁️ Cloud Deployment

#### Heroku
```bash
# Tạo Procfile
echo "web: java -jar target/room-book-0.0.1-SNAPSHOT.jar" > Procfile

# Deploy
heroku create xhub-room-booking
git push heroku main
```

#### Railway
```bash
# Kết nối GitHub repository
# Railway sẽ tự động build và deploy
```

#### Render
```bash
# Tạo service từ GitHub repository
# Cấu hình build command: mvn clean install
# Cấu hình start command: java -jar target/room-book-0.0.1-SNAPSHOT.jar
```

### 🖥️ VPS Deployment
```bash
# Build JAR file
mvn clean package -DskipTests

# Upload to server
scp target/room-book-0.0.1-SNAPSHOT.jar user@server:/app/

# Create systemd service
sudo nano /etc/systemd/system/xhub-booking.service
```

```ini
[Unit]
Description=XHub Room Booking System
After=network.target

[Service]
Type=simple
User=appuser
ExecStart=/usr/bin/java -jar /app/room-book-0.0.1-SNAPSHOT.jar
Restart=always

[Install]
WantedBy=multi-user.target
```

```bash
# Start service
sudo systemctl enable xhub-booking
sudo systemctl start xhub-booking
```

---

## 🧪 Testing

### 🔧 Unit Tests
```bash
# Chạy tất cả tests
mvn test

# Chạy test với coverage
mvn test jacoco:report
```

### 🌐 Integration Tests
```bash
# Chạy integration tests
mvn verify
```

### 📱 API Testing
```bash
# Sử dụng Postman collection
# Import file: postman_collection.json
```

---

## 📊 Database Schema

### 🗄️ Entity Relationships
```
Users (1) ←→ (N) Bookings
Customers (1) ←→ (N) Bookings
Rooms (1) ←→ (N) Bookings
RoomTypes (1) ←→ (N) Rooms
Bookings (1) ←→ (1) Bills
```

### 📋 Database Tables
| Table | Columns | Mô tả |
|-------|---------|-------|
| `users` | id, username, password, email, role, timestamps | Quản lý người dùng hệ thống |
| `room_types` | id, name, description, price_per_night, capacity, timestamps | Loại phòng và giá |
| `rooms` | id, room_number, room_type_id, status, floor_number, timestamps | Thông tin phòng |
| `customers` | id, first_name, last_name, email, phone, address, id_card, timestamps | Thông tin khách hàng |
| `bookings` | id, customer_id, room_id, check_in_date, check_out_date, total_amount, status, notes, timestamps | Đặt phòng |
| `bills` | id, booking_id, amount, tax_amount, total_amount, payment_status, payment_method, timestamps | Hóa đơn |

---

## 🐛 Troubleshooting

### ❌ Common Issues

#### 1. Database Connection Error
```bash
# Kiểm tra MySQL service
sudo systemctl status mysql

# Kiểm tra connection
mysql -u username -p -h localhost
```

#### 2. Port Already in Use
```bash
# Tìm process sử dụng port 8080
lsof -i :8080

# Kill process
kill -9 <PID>
```

#### 3. Maven Build Error
```bash
# Clean và rebuild
mvn clean install -U

# Kiểm tra Java version
java -version
```

#### 4. CORS Error
```bash
# Kiểm tra CORS configuration
# Đảm bảo SecurityConfig được cấu hình đúng
```

### 🔍 Debug Mode
```bash
# Chạy với debug logging
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dlogging.level.com.xhub.room_book=DEBUG"
```

---

## 📈 Performance Optimization

### ⚡ Database Optimization
```sql
-- Tạo indexes cho performance
CREATE INDEX idx_room_status ON rooms(status);
CREATE INDEX idx_booking_dates ON bookings(check_in_date, check_out_date);
CREATE INDEX idx_customer_email ON customers(email);
```

### 🚀 Application Optimization
```yaml
# application.yml
spring:
  jpa:
    properties:
      hibernate:
        jdbc:
          batch_size: 20
        order_inserts: true
        order_updates: true
```

### 📊 Monitoring
```yaml
# Thêm Actuator cho monitoring
management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics
```

---

## 🤝 Contributing

### 📝 Quy trình đóng góp
1. **Fork** repository
2. **Create** feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** changes (`git commit -m 'Add some AmazingFeature'`)
4. **Push** to branch (`git push origin feature/AmazingFeature`)
5. **Open** Pull Request

### 🎯 Coding Standards
- **Java**: Follow Google Java Style Guide
- **SQL**: Use meaningful table and column names
- **API**: Follow RESTful conventions
- **Frontend**: Use semantic HTML and clean CSS

---

## 📄 License

Dự án này được phân phối dưới giấy phép MIT. Xem file `LICENSE` để biết thêm chi tiết.

---

## 🙏 Acknowledgments

- **Spring Boot Team**: Framework tuyệt vời
- **MySQL Community**: Database system
- **Open Source Community**: Các thư viện và tools
- **Stack Overflow**: Giải đáp thắc mắc

---

## 📞 Contact

<div align="center">

**Chau Nhat Duy** - *Full Stack Developer*

[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/your-username)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/your-profile)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:your-email@gmail.com)

**Dự án**: [XHub Room Booking System](https://github.com/your-username/room-book)

*"Building modern web applications with passion and precision"* 🚀

</div>

---

<div align="center">

**⭐ Nếu dự án này hữu ích, hãy cho một star! ⭐**

[![GitHub stars](https://img.shields.io/github/stars/your-username/room-book?style=social)](https://github.com/your-username/room-book)
[![GitHub forks](https://img.shields.io/github/forks/your-username/room-book?style=social)](https://github.com/your-username/room-book)
[![GitHub issues](https://img.shields.io/github/issues/your-username/room-book)](https://github.com/your-username/room-book/issues)

</div>
