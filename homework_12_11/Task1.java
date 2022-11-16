import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль сумму всех абсолютных значений массива
public class Task1 {
public static void main(String[] args) {
double[] array = new double[10];
double sum=0;
for (int i = 0; i < array.length; i++) {
array[i] = Math.random()*100;
System.out.println(array[i]);
}
System.out.println(" ");
for (int i = 0; i < array.length; i++) {
sum=sum + Math.abs(array[i]);
}
System.out.println(sum);
}
}