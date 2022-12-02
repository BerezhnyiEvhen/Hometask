import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль наименьший елемент массива
public class Task5 {
public static void main(String[] args) {
double[] array = new double[10];
double minimum=1000;
for (int i = 0; i < array.length; i++) {
array[i] = Math.random()*100;
System.out.println(array[i]);
if(array[i]<minimum)
minimum = array[i];
}
System.out.println("Minimal value = " + minimum);
}
}