package Task4;

import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс Employee с параметрами id, firstName, lastName, salary,
// конструктор которым задается ид, имя,, фамилия  и зп, а так же методы
// получения имени,фамилии, ид и текущей зп. метод повышения зп, который
// принимает параметр процента на который нужно пожнять зп, написать метод
// который выводит на екран годовую зарплату.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId("ID: 123456789");
        System.out.println(employee.getId());
        System.out.println("");
        employee.setFirstName("Andriy");
        System.out.println(employee.getFirstName());
        employee.setLastName("Shevchenko");
        System.out.println(employee.getLastName());
        System.out.println("");
        employee.setSalary(15000);
        System.out.println(employee.getSalary());
        employee.salaryPerYear();
        employee.increaseSalary();
        System.out.println("");
    }
}
