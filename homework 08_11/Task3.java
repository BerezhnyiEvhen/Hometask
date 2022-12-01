import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

class Task3 {
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
System.out.println("Please enter the value of degrees Celsius:");
int celsius = myObj.nextInt();
System.out.println("It is " + (32 + celsius * 1.8)+ " degrees Fahrenheit");
}
}