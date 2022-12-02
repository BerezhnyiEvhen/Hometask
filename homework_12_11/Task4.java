import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль cумму всех елементов массива возведенных в квадрат
public class Task4 {
public static void main(String[] args) {
double[] array = new double[10];
double sum = 0;
for (int i = 0; i < array.length; i++) {
array[i] = Math.random() * 10;
sum = sum + Math.pow(array[i], 2);
}
System.out.println(sum);
}
}