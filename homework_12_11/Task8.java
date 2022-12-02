import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль массив чисел увеличенных в два раза, для решения использовать библиотеку Math
class Task8 {
public static void main(String[] args) {
int[] array = new int[10];
double value =2;
for (int i = 0; i < array.length; i++) {
array[i] =(int)(Math.random()*100)+1;
System.out.print(Math.multiplyExact(array[i],2)+", ");
}
}
}