package Task5;

import java.util.Scanner;

public class Employee {
    String id;
    String firstName;
    String lastName;
    double salary;
    double increasePercentage;
    double increasedSalary;

    Employee(String lastName, String firstName, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public void increaseSalary() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please, enter the increase percentagу,%: ");
        double increasePercentage = inputScanner.nextDouble();
        double increasedSalary = salary * (1 + increasePercentage / 100);
        System.out.println("The year salary after increase : " + (increasedSalary * 12) + " €");
    }
}


