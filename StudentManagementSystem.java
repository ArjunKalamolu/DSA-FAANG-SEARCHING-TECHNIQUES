import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a student entity with academic details.
 */
class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getCgpa() { return cgpa; }

    @Override
    public String toString() {
        return String.format("| %-5d | %-20s | %-10s | %-5.2f |", id, name, department, cgpa);
    }
}

/**
 * Main application class for handling Student CRUD operations.
 * Uses BufferedReader for efficient Input/Output.
 */
public class StudentManagementSystem {
    
    
    private static List<Student> students = new ArrayList<>();
    
   
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   STUDENT RECORD MANAGEMENT SYSTEM V1.0  ");
        System.out.println("==========================================");

       
        students.add(new Student(101, "Arjun Kumar", "CSE", 7.69));
        students.add(new Student(102, "Ravi Teja", "ECE", 8.1));
        students.add(new Student(103, "Raghavendra R", "EEE", 9.2));

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
               
                String input = reader.readLine();
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1: addStudent(); break;
                    case 2: viewStudents(); break;
                    case 3: searchStudent(); break;
                    case 4: deleteStudent(); break;
                    case 5:
                        System.out.println("Exiting System. Good luck with Deloitte!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice! Please enter 1-5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid Input! Please enter a number.");
            } catch (IOException e) {
                System.out.println("Error: Input/Output failure.");
            }
        }
    }

    private static void addStudent() throws IOException {
        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(reader.readLine());

        System.out.print("Enter Student Name: ");
        String name = reader.readLine();

        System.out.print("Enter Department: ");
        String dept = reader.readLine();

        System.out.print("Enter CGPA: ");
        double cgpa = Double.parseDouble(reader.readLine());

        students.add(new Student(id, name, dept, cgpa));
        System.out.println(">> Student Added Successfully!");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("| %-5s | %-20s | %-10s | %-5s |%n", "ID", "NAME", "DEPT", "CGPA");
        System.out.println("-----------------------------------------------------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------------------------");
    }

    private static void searchStudent() throws IOException {
        System.out.print("Enter ID to Search: ");
        int searchId = Integer.parseInt(reader.readLine());

        Student foundStudent = students.stream()
                .filter(s -> s.getId() == searchId)
                .findFirst()
                .orElse(null);

        if (foundStudent != null) {
            System.out.println("Record Found: " + foundStudent);
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }
    }

    private static void deleteStudent() throws IOException {
        System.out.print("Enter ID to Delete: ");
        int deleteId = Integer.parseInt(reader.readLine());

        boolean removed = students.removeIf(s -> s.getId() == deleteId);

        if (removed) {
            System.out.println(">> Student Record Deleted.");
        } else {
            System.out.println("Student ID not found.");
        }
    }
}