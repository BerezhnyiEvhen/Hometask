import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Task2 {
public static void main(String[] params) {

Scanner myObj = new Scanner(System.in);
System.out.println("Please enter the first value:");
int number1 = myObj.nextInt();
System.out.println("Please enter the second value:");
int number2 = myObj.nextInt();
int sum = number1 + number2;
int dif = number1 - number2;
int mult = number1 * number2;
int div = number1 / number2;
int ostatok = number1 % number2;
float procent = ((number1 * 100) / number2);
System.out.println("Сумма чисел равна = " + sum);
System.out.println("Разность чисел равна = " + dif);
System.out.println("Произведение чисел равно = " + mult);
System.out.println("Частное чисел равно = " + div);
System.out.println("Остаток от деления чисел равно = " + ostatok);
System.out.println("Процент первого числа от второго равен = " + procent+" %");
    }
}