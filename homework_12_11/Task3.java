import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль сумму всех целых чисел от 1 до заданного значения, число всегда больше 0
public class Task3 {
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
System.out.println("Please enter the value before:");
int number1 = myObj.nextInt();
int sum=1;
for (int i =2; i <= number1; i++) {
sum+=i;
}
System.out.println(sum);
}
}
