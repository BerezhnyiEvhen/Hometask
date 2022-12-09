//написать класс Triangle с параметрами сторон и метод вычисления площади и периметра фигуры

import java.util.Scanner;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;
    double perimeter;
    double halfPerimeter;
    double square;

    public Triangle() {
    }

    public void searchPerimeterSquare() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please, enter side A of the triangle, sm: ");
        double sideA = inputScanner.nextDouble();
        System.out.print("Please, enter side B of the triangle, sm: ");
        double sideB = inputScanner.nextDouble();
        System.out.print("Please, enter side C of the triangle, sm: ");
        double sideC = inputScanner.nextDouble();
        System.out.println("");
        this.perimeter = sideA + sideB + sideC;
        this.halfPerimeter = this.perimeter / 2.0;
        double square = Math.sqrt(this.halfPerimeter * (this.halfPerimeter - sideA) * (this.halfPerimeter - sideB) * (this.halfPerimeter - sideC));
        System.out.println("The perimeter of the triangle: " + this.perimeter + " sm.");
        System.out.println("The square of the triangle: " + square + " square sm.");
    }
}
