// Overview of the LMS Application
// This project uses Java Swing for GUI and incorporates the key functionalities for Admin, Instructor, and Student roles.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;

// Main class for the application
public class LMSApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginScreen());
    }
}

// Base User class
class User {
    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

// Admin class
class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }

    public void manageCourses() {
        System.out.println("Managing courses...");
    }
}

// Instructor class
class Instructor extends User {
    private ArrayList<String> courses = new ArrayList<>();

    public Instructor(String username, String password) {
        super(username, password);
    }

    public void createCourse(String course) {
        courses.add(course);
        System.out.println("Course created: " + course);
    }

    public void monitorPerformance() {
        System.out.println("Monitoring student performance...");
    }
}

// Student class
class Student extends User {
    private ArrayList<String> enrolledCourses = new ArrayList<>();

    public Student(String username, String password) {
        super(username, password);
    }

    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
        System.out.println("Enrolled in: " + course);
    }

    public void trackProgress() {
        System.out.println("Tracking progress...");
    }
}

// Login screen GUI
class LoginScreen extends JFrame {
    public LoginScreen() {
        setTitle("LMS Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passText = new JPasswordField();
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passText.getPassword());

            if (username.equals("rksAdmin") && password.equals("rks@123")) {
                new AdminDashboard();
            } else if (username.startsWith("rksinstructor") && password.equals("rks@123")) {
                new InstructorDashboard(username);
            } else if (username.startsWith("rksstudent") && password.equals("rks@123")) {
                new StudentDashboard(username);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
            dispose();
        });

        panel.add(userLabel);
        panel.add(userText);
        panel.add(passLabel);
        panel.add(passText);
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }
}

// Admin dashboard
class AdminDashboard extends JFrame {
    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton manageUsers = new JButton("Manage Users");
        JButton manageCourses = new JButton("Manage Courses");
        JButton viewReports = new JButton("View Reports");

        manageUsers.addActionListener(e -> JOptionPane.showMessageDialog(this, "Managing users..."));
        manageCourses.addActionListener(e -> JOptionPane.showMessageDialog(this, "Managing courses..."));
        viewReports.addActionListener(e -> JOptionPane.showMessageDialog(this, "Viewing reports..."));

        JPanel panel = new JPanel();
        panel.add(manageUsers);
        panel.add(manageCourses);
        panel.add(viewReports);

        add(panel);
        setVisible(true);
    }
}

// Instructor dashboard
class InstructorDashboard extends JFrame {
    public InstructorDashboard(String username) {
        setTitle("Instructor Dashboard - " + username);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton createCourse = new JButton("Create Course");
        JButton monitorPerformance = new JButton("Monitor Performance");

        createCourse.addActionListener(e -> JOptionPane.showMessageDialog(this, "Creating course..."));
        monitorPerformance.addActionListener(e -> JOptionPane.showMessageDialog(this, "Monitoring performance..."));

        JPanel panel = new JPanel();
        panel.add(createCourse);
        panel.add(monitorPerformance);

        add(panel);
        setVisible(true);
    }
}

// Student dashboard
class StudentDashboard extends JFrame {
    public StudentDashboard(String username) {
        setTitle("Student Dashboard - " + username);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton enrollCourse = new JButton("Enroll in Course");
        JButton trackProgress = new JButton("Track Progress");

        enrollCourse.addActionListener(e -> JOptionPane.showMessageDialog(this, "Enrolling in course..."));
        trackProgress.addActionListener(e -> JOptionPane.showMessageDialog(this, "Tracking progress..."));

        JPanel panel = new JPanel();
        panel.add(enrollCourse);
        panel.add(trackProgress);

        add(panel);
        setVisible(true);
    }
}

