
// Abstract class
abstract class Member {
    // Data members
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    // Constructor to initialize data members
    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    // Abstract method to print salary
    abstract void printSalary();
}
// Subclass 1
class Employee extends Member {
    // Data member
    String specialization;
    // Constructor to initialize data members
    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    // Implementation of abstract method
    void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}


// Subclass 2
class Manager extends Member {
    // Data member
    String department;
    // Constructor to initialize data members
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    // Implementation of abstract method
    void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}
// Main class
public class MembersDetails {
    public static void main(String[] args) {
        // Create objects of Employee and Manager classes
        Member employee = new Employee("John Doe", 30, "1234567890", "123 Main St", 50000, "Software Development");
        Member manager = new Manager("Jane Smith", 35, "9876543210", "456 Oak St", 80000, "HR");
        // Print details of Employee
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + ((Employee) employee).specialization);
        System.out.println();
        // Print details of Manager
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + ((Manager) manager).department);
    }
}