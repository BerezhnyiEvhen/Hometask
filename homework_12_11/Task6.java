import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль массив чисел в обратном порядке, полученный из числа введенного в консоль
class Task6 {
public static void main(String[] args) {
double[] array = new double[10];
for (int i = 0; i < array.length; i++) {
array[i] = Math.random()*100;//didn`t understand how fill it on console, i`ve done it with random
System.out.println(array[i]);
}
System.out.println(" ");
for (int i = 9; i >=0; i--) {
System.out.println(array[i]);
}
}
}