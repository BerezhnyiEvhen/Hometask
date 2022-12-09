import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать программу которая из потока ввода-вывода сканер принимает целочисленное число и выводит на екран число положительное или отрицательное,а если ноль,то сообщение об этом и программа завершается. Обработать получение не численных значений
public class Task6 {
public static void main(String[] args) {
Scanner inputScanner = new Scanner(System.in);
System.out.println("Input the number: ");
String num_str = inputScanner.nextLine();
if (!isNumeric(num_str)) {
System.out.println("Entered value is not a number!");
} else {
int num = Integer.parseInt(num_str);
if (num < 0) {
System.out.println("Entered number is negative");
} else if (num == 0) {
System.out.println("Entered number is null");
} else {
System.out.println("Entered number is positive");
}
inputScanner.close();
}
}
public static boolean isNumeric(String str){
return str.matches("-?\\d+(\\.\\d+)?");
}
}