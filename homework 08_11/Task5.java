import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

class Task5 {
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
System.out.println("Please enter the first value:");
int number1 = myObj.nextInt();
System.out.println("Please enter the second value:");
int number2 = myObj.nextInt();
System.out.println(" ");
if (number1 < number2){
System.out.println("The biggest one is " + number2);
}else{
System.out.println("The biggest one is " + number1);
}
}
}