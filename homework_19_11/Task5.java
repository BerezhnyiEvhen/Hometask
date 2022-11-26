import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который из потока ввода-вывода сканер принимает число с плавающей точкой и выводит на екран 1)число округоленное к меньшему целочисленному значению 2)само число 3)к большему целочисленному значению,для решения использовать библиотеку Math
public class Task5 {
public static void main(String[] args) {
Scanner inputScanner = new Scanner(System.in);
System.out.println("Input the number: ");
double inputNumber = inputScanner.nextDouble();
System.out.println("The number is: "+inputNumber);
System.out.println("The number rounded down: "+(int)Math.floor(inputNumber));
System.out.println("The number rounded up: "+ (int)Math.ceil(inputNumber));
}
}