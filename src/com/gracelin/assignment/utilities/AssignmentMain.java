package com.gracelin.assignment.utilities;

// imported the outside package employye to perform object in it
import com.gracelin.assignment.employee.*;
public class AssignmentMain {
// main class
	public static void main(String[] args) {
		Manager manager = new Manager("Grace", 101, 90000, 5);
        Developer developer = new Developer("Benita", 102, 75000, "Java");

        Employeeutilities.displayEmployeeInfo(manager);
        Employeeutilities.displayEmployeeInfo(developer);

        Employeeutilities.increaseSalary(manager, 5000);
        Employeeutilities.increaseSalary(developer, 3000);
        
        Employeeutilities.displayEmployeeInfo(manager);
       Employeeutilities.displayEmployeeInfo(developer);
    }
}