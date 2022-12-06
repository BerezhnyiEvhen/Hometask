import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;


//написать программу нахождения факториала числа,число получаем из потока ввода-вывода сканер,результат выводится на екран
public class Task7 {
public static void main(String args[]) {
int number;
do {
Scanner scan = new Scanner(System.in);
System.out.print("Enter factorial number : ");
number = scan.nextInt();
if(number < 0) {
System.out.println("Error. It is negative number.Please, try again!");
} else {
int result = 1;
for (int i = 2; i <= number; i++)
result *= i;
System.out.println(result);
if (number == 0 || number == 1)
System.out.println(result);
}
} while (number < 0);
}
}