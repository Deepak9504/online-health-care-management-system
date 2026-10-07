
# Online Health Care Management System
A Java–JDBC Based Healthcare Application

Team Name: COMPILE COMMANDER
Section: 35
 #Introduction

The Online Health Care Management System is a Java-based application designed to make healthcare services faster, easier, and more organized.
It allows patients to book appointments, view reports, and access medical history, while doctors can manage appointments and patient details.

This project demonstrates the implementation of OOP Concepts, JDBC, Database operations, and modular Java architecture.
🎯 Objectives

Enable patients to book appointments online

Help doctors manage patient records & schedules

Reduce paperwork with digital record keeping

Provide easy access to medical history & reports

Improve communication between doctors and patients

Offer fast, reliable, and organized healthcare services
🧰 Technologies Used

Java (Core + OOP)

JDBC

MySQL

DAO Pattern

Servlets / JSP (optional for extension)

Web / GUI Interface (extendable)
🏗 System Architecture
✔ Presentation Layer

Handles UI (Console / Web / GUI)

✔ Business Logic Layer

Implements:

Login

Registration

Appointment handling

Validation

Service logic

✔ Data Access Layer (DAO)

Handles:

Database queries

CRUD operations

JDBC connectivity

✔ Database (MySQL)

Tables:

users

patients

doctors

appointments

reports

🗄 Database Schema (MySQL)
Users Table
user_id INT PRIMARY KEY AUTO_INCREMENT
name VARCHAR(100)
email VARCHAR(100) UNIQUE
password VARCHAR(255)
role ENUM('patient','doctor','admin')
created_at DATETIME

Patients Table
patient_id INT PRIMARY KEY AUTO_INCREMENT
name VARCHAR(50)
age INT
gender VARCHAR(10)
disease VARCHAR(100)

Create Database
CREATE DATABASE health_care;

USE health_care;

CREATE TABLE patients (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(10),
    disease VARCHAR(100)
);

🔌 JDBC Connectivity Example
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/healthcare_db", "root", ""
);
System.out.println("Connected Successfully!");

🧩 Patient Model (OOP Example)
public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String disease;

    public Patient(String name, int age, String gender, String disease) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }

    public Patient(int id, String name, int age, String gender, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }

    // Getters & Setters
}

📚 DAO Class (Database Operations)
public class PatientDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/health_care";
    private static final String USER = "root";
    private static final String PASS = "your_password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public void addPatient(Patient p) {
        String sql = "INSERT INTO patients (name, age, gender, disease) VALUES (?,?,?,?)";

        try (Connection conn = getConnection(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, p.getName());
            pstmt.setInt(2, p.getAge());
            pstmt.setString(3, p.getGender());
            pstmt.setString(4, p.getDisease());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

📂 Project Folder Structure
OnlineHealthCareSystem/
│
├── src/
│   ├── model/
│   │   └── Patient.java
│   ├── dao/
│   │   └── PatientDAO.java
│   ├── db/
│   │   └── DBConnection.java
│   └── main/
│       └── App.java
│
├── database/
│   └── health_care.sql
│
└── README.md

⚡ Features
👨‍⚕ For Patients

Register & Login

Book Appointments

View Medical Reports

Check Doctor Details

🩺 For Doctors

View Patient Details

Manage Appointments

Update medical records

🛠 System Features

OOP-Based modular design

JDBC connectivity

CRUD operations

MySQL database integration

🚀 How to Run the Project
1️⃣ Install Required Software

Java JDK 8+

MySQL Server

Any IDE (VS Code / IntelliJ / Eclipse)

2️⃣ Import Database

Run SQL file:

mysql -u root -p health_care < health_care.sql

3️⃣ Configure DB Credentials

Update inside PatientDAO.java or DBConnection.java:

String url = "jdbc:mysql://localhost:3306/health_care";
String username = "root";
String password = "";

4️⃣ Compile & Run
javac App.java
java App

🧾 Conclusion

This project demonstrates the successful integration of:
✔ Java OOP Concepts
✔ JDBC Connectivity
✔ DAO Design Pattern
✔ MySQL Database
✔ Modular and scalable architecture
