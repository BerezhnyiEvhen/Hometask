import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль сумму всех позитивных значений массива
public class Task2 {
public static void main(String[] args) {
double[] array = new double[10];
double sumPositive=0;
for (int i = 0; i < array.length; i++) {
array[i] = Math.random()*10-5;
System.out.println(array[i]);
}
System.out.println(" ");
for (int i = 0; i < array.length; i++) {
if(array[i]>0) {
sumPositive += array[i];
}
}
System.out.println(sumPositive);
}
}