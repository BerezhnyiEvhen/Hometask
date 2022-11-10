import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

class Task6 {
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
System.out.println("Please enter the first value:");
int number1 = myObj.nextInt();
System.out.println("Please enter the second value:");
int number2 = myObj.nextInt();
System.out.println("Please enter the second value:");
int number3 = myObj.nextInt();
System.out.println(" ");
if (number1>number2 && number1>number3){
System.out.println("The biggest one is " + number2);
}else if(number1<number2 && number2>number3){
System.out.println("The biggest one is " + number1);
}else if(number1<number3 && number2<number3){
System.out.println("The biggest one is " + number3);
}
}
}