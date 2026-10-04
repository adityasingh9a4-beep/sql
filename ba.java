import java.util.*;

class Employee {
    String name;
    int age;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class ba {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.name = "Aditya";
        m.age = 20;
        m.department = "IT";

        m.displayManager();
    }
}