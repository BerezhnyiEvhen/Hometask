//написать класс Circle с параметрами радиуса, методом получения  и задания радиуса и вычисления площади круга

import java.util.Scanner;

public class Circle {
    double radius;

    public Circle() {
    }

    public void searchSquare() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please, enter the radius of the circle, sm: ");
        double radius = inputScanner.nextDouble();
        System.out.println("");
        double square = Math.PI * Math.pow(radius, 2.0);
        System.out.print("The square of the circle: " + square + " square sm.");
    }
}