package Task4;

import java.util.Date;
import java.util.Scanner;

public class Employee {
    String id;
    String firstName;
    String lastName;
    double salary;
    double increasePercentage;
    double increasedSalary;

    public String getId(){
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary(){
        return this.salary;
    }
    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    public void increaseSalary(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please, enter the increase percentagу,%: ");
        double increasePercentage = inputScanner.nextDouble();
        double increasedSalary =salary*(1+increasePercentage/100);

        System.out.println("");
        System.out.println("The increased salary will be: "+increasedSalary+" €");
        System.out.println("The year salary after increase : "+(increasedSalary*12)+" €");
    }
    public void salaryPerYear(){
        System.out.println("The year salary before increase : "+(salary*12)+" €");
    }
}


