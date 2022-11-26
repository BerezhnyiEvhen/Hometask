package Task3;

import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    double perimeter;
    double halfPerimeter;
    double square;
    public void searchPerimeterSquare(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please, enter side A of the triangle, sm: ");
        double sideA = inputScanner.nextDouble();
        System.out.print("Please, enter side B of the triangle, sm: ");
        double sideB = inputScanner.nextDouble();
        System.out.print("Please, enter side C of the triangle, sm: ");
        double sideC = inputScanner.nextDouble();
        System.out.println("");
        perimeter=sideA+sideB+sideC;
        halfPerimeter=perimeter/2;
        double square = Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
        System.out.println("The perimeter of the triangle: "+perimeter+" sm.");
        System.out.println("The square of the triangle: "+square+" square sm.");
    }
}
