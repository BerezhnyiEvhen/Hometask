//в классе мейн, метод мейн создать обьект класса Box, задать стороны,
// вычислить площадь. создать обьект класс Circle задать радиус, вывести
// на екран площадь, так же для треугольника. создать два обьекта класса
// работник, вывести информацию о работниках, повысить зп от 10 до 20%
// вывести на экран и посчитать новую годовую зп.

public class Main {
    public static void main(String[] args) {
        //Task1 - Box
        Box box = new Box(10, 20, 30);
        box.searchVolume();
        System.out.println();

        //Task2 - Circle
        Circle circle = new Circle();
        circle.searchSquare();
        System.out.println();

        //Task3 - Triangle
        Triangle triangle = new Triangle();
        triangle.searchPerimeterSquare();

        //Task4 - Employeed
        Employee employee = new Employee("123456789","Andriy","Shevchenko",12000.0);
        System.out.println("Employee`s id is: "+ employee.getId());
        System.out.println("Employee`s firstName is: "+ employee.getFirstName());
        System.out.println("Employee`s lastName is: "+ employee.getLastName());
        System.out.println("Employee`s salary is: "+ employee.getSalary());
        employee.printYearSalary();
        System.out.println("Increased salary is: "+ employee.increaseSalary(20));
        employee.printYearSalary();

    }
}
