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

![adminLogin](https://github.com/user-attachments/assets/f193e724-0289-4824-8497-24fff310bf25)
![Screenshot (138)](![Screenshot ![Screenshot (148)](https://github.com/user-![Screenshot (154)](https://github.com/user-attachments/assets/263a15a8-c857-4775-9172-e1bf0209c9f7)
![Sc![Screenshot (153)](htt![Screenshot (156)](https://github.com/user-attachments/assets/d22285f5-57c5-45b4-9048-e957b2b54bc0)
ps://github.com/user-attachments/assets/dc47d076-f79e-41a7-b5ce-cf46fd![Screenshot (155)](https://github.com/user-attachments/assets/29fbed85-65d2-4b8e-b717-a100c86b82d7)
b954b0)
reenshot (152)](https://github.com/user-attachments/assets/00c5086a-d30b-4986-b410-ae1d8557a726)
attachm![Screenshot (151)](https://github.com/user-attachments/assets/e0dc572c-52c8-4f7e-975a-ad7f7280d52f)
![Screenshot (149)](https://github.com/user-attachments/assets/9a9b2c3a-1749-4e0d-8008-3975850f0b19)
ents/assets/890a0511-180d-4840-af02-0c9f51eb472b)
(147)](https://github.com/user-attachments/assets/b22ed919-f456-4a4f-a64f-b37b08397d38)
http![![Screenshot (147)](https://github.com/user-attachments/assets/d2288a41-378c-4714-beff-09161c89042e)
Screenshot (146)](https://github.com/user-attachments/assets/8f2005f0-a289-4344-85d2-5e0dec546392)
s://github.com/user-at![Scree![Screenshot (145)](https://github.com/user-attachments/assets/b7bbf415-2447-4d90-a58a-bba0d679794e)
nshot (143)](https://github.com/user-attachments/assets/a9e1fbf0-c97f-43d5-95f3-e5b92fa4c146)
tachments/assets/71b8cca1-1188-4718-821c-b0017f29dc57)



