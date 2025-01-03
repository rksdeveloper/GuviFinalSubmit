# Learning Management System (LMS) Project

## Table of Contents
1. **Introduction**
2. **Project Objectives**
3. **System Architecture**
4. **Features and Functionalities**
   - Admin
   - Instructor
   - Student
5. **Implementation Details**
6. **Error Handling and Robustness**
7. **Data Validation**
8. **Event Handling and Integration**
9. **Core Features Implementation**
10. **Code Quality and Innovation**
11. **How to Run the Project**
12. **Conclusion**

---

## 1. Introduction
The Learning Management System (LMS) project is a GUI-based application developed in Java using Swing. It provides an interactive platform for administrators, instructors, and students to manage and engage with educational resources.

### Purpose:
The primary goal is to simplify the management of educational tasks, such as course creation, enrollment, and student performance tracking.

---

## 2. Project Objectives
- Create a user-friendly GUI application for managing learning resources.
- Implement separate dashboards for administrators, instructors, and students.
- Ensure error handling, data validation, and integration of components.

---

## 3. System Architecture
### Layers:
1. **User Interface:** Java Swing is used to create interactive GUIs.
2. **Logic Layer:** Handles user authentication, role-specific actions, and event handling.
3. **Data Layer:** Currently uses hardcoded data but is designed for easy integration with databases.

---

## 4. Features and Functionalities
### Admin:
- **Manage Users:** Add, edit, and delete users.
- **Manage Courses:** Create and organize courses.
- **System Analytics:** View system performance reports.

### Instructor:
- **Create Courses:** Design courses and add materials.
- **Quizzes and Assignments:** Develop and assign quizzes.
- **Monitor Student Performance:** Track student progress and grades.

### Student:
- **Enroll in Courses:** Browse and join available courses.
- **Access Materials:** View lectures, quizzes, and assignments.
- **Track Progress:** Monitor grades and progress.

---

## 5. Implementation Details
### Tools and Technologies:
- **Programming Language:** Java
- **IDE:** IntelliJ IDEA
- **GUI Library:** Java Swing

### Key Classes:
1. **User:** Base class for Admin, Instructor, and Student.
2. **AdminDashboard:** Manages admin-specific functionalities.
3. **InstructorDashboard:** Handles instructor actions like course creation.
4. **StudentDashboard:** Allows students to enroll in courses and track progress.

---

## 6. Error Handling and Robustness
- **Invalid Login:** Displays a message if credentials are incorrect.
- **Null Values:** Prevents submission of empty fields in forms.
- **Role-Specific Access:** Ensures users can only access permitted functionalities.

---

## 7. Data Validation
- **Login Validation:** Validates credentials for username and password.
- **Input Fields:** Ensures non-empty and correctly formatted inputs.
- **Restricted Actions:** Prevents unauthorized actions.

---

## 8. Event Handling and Integration
- **Action Listeners:** Handles button clicks to execute functionalities.
- **Switching Screens:** Dynamically loads different dashboards based on user roles.

---

## 9. Core Features Implementation
1. Separate dashboards for each user role.
2. Role-based functionality segregation.
3. Basic course and user management systems.

---

## 10. Code Quality and Innovation
- **Code Modularity:** Classes and methods are modular for better readability.
- **Scalability:** Designed to integrate databases and new features easily.
- **Innovation:** Simplifies LMS tasks with a beginner-friendly interface.

---

## 11. How to Run the Project
### Prerequisites:
- Install IntelliJ IDEA.
- Set up a Java Development Kit (JDK).

### Steps:
1. Open IntelliJ IDEA and create a new project.
2. Copy the provided code files into the project.
3. Compile and run the `LMSApplication` file.
4. Use the credentials:
   - **Admin:** Username: `admin`, Password: `admin`
   - **Instructor:** Username starts with `instructor`, Password: `123`
   - **Student:** Username starts with `student`, Password: `123`

---

## 12. Conclusion
This LMS project demonstrates how to develop a GUI-based application with role-specific functionalities. It provides a foundation for further enhancements, such as integrating databases, advanced analytics, and real-time communication.

---

### Future Scope
- Add a database for persistent data storage.
- Implement advanced analytics and reporting tools.
- Enhance the GUI for better user experience.

---
## Team Members:
- **Samiksha Singh** (Team Leader)
- **Raj Kumar Sharma**
- **Prasoon Singh**
- **Rishita Gupta**
- 


---

### Adding Images 


![login](https://github.com/user-attachments/assets/4b9e29c7-acfd-4a0c-909b-907a70b18abb)

![adminLogin](https://github.com/user-attachments/assets/54436c6e-001d-4ec2-aaf7-d9143923343b)
![admin1](https://github.com/user-attachments/assets/56114fdf-df52-4b45-bd3c-89ba651426d1)
![admin](https://github.com/user-attachments/assets/0218314f-fef9-469e-b198-10263e3ed702)
![instructordashboard](https://github.com/user-attachments/assets/5c15f554-0b33-45df-a7d6-a6e224304b35)

![StudentLogin](https://github.com/user-attachments/assets/88d52a2f-52df-4dbe-b737-0257448c1112)
![studentDashboard](https://github.com/user-attachments/assets/5aef562a-02b9-44b2-8f61-1871fe783f3b)
![studentdashboard1](https://github.com/user-attachments/assets/aa63013f-0fa0-43f1-8669-6197c1946a90)





