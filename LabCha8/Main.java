class Employee {
    String employeeID;
    String name;
    double hourlyWage;
    double hoursWorked;

    // Constructor to initialize the attributes
    public Employee(String employeeID, String name, double hourlyWage, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate monthly salary
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        double salary = calculateSalary();
        System.out.println("ID: " + employeeID + ", Name: " + name + ", Wage: " + hourlyWage + ", Hours Worked: " + (int)(hoursWorked) + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("E001", "Alice Go", 15.0, 160);
        Employee emp2 = new Employee("E002", "Bob Hann", 18.0, 150);

        // Displaying input details
        System.out.println("\nEmployee 1:");
        System.out.println("   ID: " + emp1.employeeID);
        System.out.println("   Name: " + emp1.name);
        System.out.println("   Hourly Wage: " + (int)(emp1.hourlyWage));
        System.out.println("   Hours Worked: " + (int)(emp1.hoursWorked));

        System.out.println("\nEmployee 2:");
        System.out.println("   ID: " + emp2.employeeID);
        System.out.println("   Name: " + emp2.name);
        System.out.println("   Hourly Wage: " + (int)(emp2.hourlyWage));
        System.out.println("   Hours Worked: " + (int)(emp2.hoursWorked));

        // Calculating and displaying salaries
        System.out.println("\nCalculating salaries...");
        System.out.println("\nEmployee Details:");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
    

