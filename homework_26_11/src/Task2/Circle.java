package Task2;

import java.util.Scanner;

import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Circle {
    double radius;
    //double square = Math.PI*Math.pow(radius,2);
    public void searchSquare(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please, enter the radius of the circle, sm: ");
        double radius = inputScanner.nextDouble();
        System.out.println("");
        double square = Math.PI*Math.pow(radius,2);
        System.out.print("The square of the circle: "+square+" square sm.");

    }
}