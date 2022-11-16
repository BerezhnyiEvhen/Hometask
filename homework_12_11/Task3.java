import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль сумму всех целых чисел от 1 до заданного значения, число всегда больше 0
public class Task3 {
public static void main(String[] args) {
double[] array = new double[10];
int sum=0;
for (int i = 0; i < array.length; i++) {
array[i] = Math.random()*100;
System.out.println(array[i]);
}
System.out.println(" ");
Scanner myObj = new Scanner(System.in);
System.out.println("Please enter the value before:");
int number1 = myObj.nextInt();
for (int i = 0; i < array.length; i++) {
if(array[i]>1 && array[i]<number1) {
sum +=(int)array[i];
}
}
System.out.println(sum);
}
}