import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль массив состоящий из двух елементов. 1й - кол-во  всех позитивных значений массива, 2й - сумма всех отрицательных. Массив вводится с консоли
class Task9 {
public static void main(String[] args) {
double[] array = new double[10];
double Amount=0;
double sumNegative=0;
for (int i = 0; i < array.length; i++) {
array[i] = Math.random()*20-10;
System.out.println(array[i]);
}
System.out.println(" ");
for (int i = 0; i < array.length; i++) {
if(array[i]>=1){
 Amount++;
 }
 if(array[i]<0) {
sumNegative += array[i];
}
}
System.out.println("Amount of positive values: " + (byte)Amount);
System.out.println("Summary of all negative values:" + sumNegative);
}
}