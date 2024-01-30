import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Address: " + address + ", GPA: " + gpa;
    }
}

public class StudentManagement {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    sortStudentsByGPA();
                    break;
                case 5:
                    sortStudentsByName();
                    break;
                case 6:
                    showStudents();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    private static void displayMenu() {
        System.out.println("/****************************************/");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort students by gpa.");
        System.out.println("5. Sort students by name.");
        System.out.println("6. Show students.");
        System.out.println("0. Exit.");
        System.out.println("/****************************************/");
    }

    private static void addStudent() {
        System.out.println("Enter student details:");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();

        Student newStudent = new Student(id, name, age, address, gpa);
        studentList.add(newStudent);

        System.out.println("Student added successfully.");
    }

    private static void editStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list. Cannot edit.");
            return;
        }

        System.out.print("Enter student ID to edit: ");
        int editId = scanner.nextInt();

        Student studentToEdit = null;
        for (Student student : studentList) {
            if (student.getId() == editId) {
                studentToEdit = student;
                break;
            }
        }

        if (studentToEdit == null) {
            System.out.println("Student with ID " + editId + " not found.");
            return;
        }

        System.out.println("Editing student with ID " + editId);
        System.out.println("Current details: " + studentToEdit);

        System.out.print("New name: ");
        String newName = scanner.nextLine(); // consume the newline character
        studentToEdit.setName(newName);

        System.out.print("New age: ");
        int newAge = scanner.nextInt();
        studentToEdit.setAge(newAge);
        scanner.nextLine(); // consume the newline character

        System.out.print("New address: ");
        String newAddress = scanner.nextLine();
        studentToEdit.setAddress(newAddress);

        System.out.print("New GPA: ");
        double newGpa = scanner.nextDouble();
        studentToEdit.setGpa(newGpa);

        System.out.println("Student edited successfully. Updated details: " + studentToEdit);
    }

    private static void deleteStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list. Cannot delete.");
            return;
        }

        System.out.print("Enter student ID to delete: ");
        int deleteId = scanner.nextInt();

        Student studentToDelete = null;
        for (Student student : studentList) {
            if (student.getId() == deleteId) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete == null) {
            System.out.println("Student with ID " + deleteId + " not found.");
            return;
        }

        studentList.remove(studentToDelete);
        System.out.println("Student with ID " + deleteId + " deleted successfully.");
    }

    private static void sortStudentsByGPA() {
        Collections.sort(studentList, Comparator.comparingDouble(Student::getGpa));
        System.out.println("Students sorted by GPA:");
        showStudents();
    }

    private static void sortStudentsByName() {
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        System.out.println("Students sorted by name:");
        showStudents();
    }

    private static void showStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("List of students:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }
}
