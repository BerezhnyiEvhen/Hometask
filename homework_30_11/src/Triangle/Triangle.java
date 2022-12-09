package Triangle;
import java.util.Scanner;
/*Написать класс Triangle имитирующий прямоугольный треугольник, со сторонами a,b,c и методами получения величины каждой
    стороны, площади, периметра треугольника. а так же добавить метод проверяющий выполнение теоремы пифагора.
    Если стороны заданы не верно вывести сообщение на екран.*/
public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA,double sideB,double sideC) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

   /* public double getSideA() {
        Scanner inputScanner = new Scanner(System.in);
        double sideA = inputScanner.nextDouble();
        System.out.print("Please, enter side A of the triangle, sm: ");
        return getSideA();
    }

    public double getSideB() {
        Scanner inputScanner = new Scanner(System.in);
        double sideB = inputScanner.nextDouble();
        System.out.print("Please, enter side B of the triangle, sm: ");
        return getSideB();
    }

    public double getSideC() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please, enter side C of the triangle, sm: ");
        double sideC = inputScanner.nextDouble();
        return getSideC();
    }*/

    public void getTrianglePerimeter() {
        System.out.println("Perimeter of the triangle is: " + (sideA + sideB + sideC) + " sm.");
    }

    public void getTriangleSquare() {
        System.out.println("Square of of the triangle is: " + ((sideA * sideB) / 2) + " sq.sm.");
    }

    public void isPythagorTheoremOk() {
        if (sideA > sideB && sideA > sideC) {
            if ((Math.pow(sideA, 2) == ((Math.pow(sideB, 2) + Math.pow(sideC, 2))))) {
                System.out.println("The Pythagor theorem is ok.");
            }else{
                System.out.println("It isn`t a right triangle.");
            }
        }else if(sideB > sideA && sideB > sideC) {
            if ((Math.pow(sideB, 2) == ((Math.pow(sideA, 2) + Math.pow(sideC, 2))))) {
                System.out.println("The Pythagor theorem is ok.");
            } else {
                System.out.println("It isn`t a right triangle.");
            }
        }else if(sideC > sideA && sideC > sideB) {
            if ((Math.pow(sideC, 2) == ((Math.pow(sideA, 2) + Math.pow(sideB, 2))))) {
                System.out.println("The Pythagor theorem is ok.");
            } else {
                System.out.println("It isn`t a right triangle.");
            }
        }
    }
}






    /*public void searchPerimeterSquare() {
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
}*/
