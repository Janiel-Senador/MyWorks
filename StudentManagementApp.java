import java.util.Scanner;

public class StudentManagementApp {
    private static Student[] students = new Student[100];
    private static int studentCount = 0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Display All Students in Reverse");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addNewStudent(scanner);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    displayAllStudentsReverse();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }

    
    private static void addNewStudent(Scanner scanner) {
        if (studentCount >= 100) {
            System.out.println("Student record is full. Cannot add more students.");
            return;
        }

        System.out.print("Enter Student ID: ");
        int idNumber = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Year Level: ");
        int yearLevel = scanner.nextInt();
        scanner.nextLine(); 
        students[studentCount] = new Student(idNumber, firstName, lastName, course, yearLevel);
        studentCount++;

        System.out.println("Student added successfully!");
    }
    private static void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\nAll Student Records:");
        for (int i = 0; i < studentCount; i++) {
            students[i].displayStudent();
        }
    }

       private static void displayAllStudentsReverse() {
        if (studentCount == 0) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\nStudent Records in Reverse Order:");
        for (int i = studentCount - 1; i >= 0; i--) {
            students[i].displayStudent();
        }
    }
}