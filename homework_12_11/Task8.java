import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль массив чисел увеличенных в два раза, для решения использовать библиотеку Math
class Task8 {
public static void main(String[] args) {
double[] array = new double[10];
for (int i = 0; i < array.length; i++) {
array[i] = Math.random()*100;
System.out.println(array[i]);
}
System.out.println(" ");
for (int i = 0; i < array.length; i++) {
System.out.println(array[i]*2);// didn`t understand which method "Math" i could use
}
}
}