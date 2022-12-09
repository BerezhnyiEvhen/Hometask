import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль среднее значение елементов целочисленного массива,значения массива задать через поток ввода-вывода класс Сканер
public class Task1 {
public static void main(String[] pars) {
Scanner scanner = new Scanner(System.in);
System.out.println("Please input amount of elements of the massive:  ");
int arrayLength = scanner.nextInt();
int[]inputArray= new int[arrayLength];
System.out.println("Please input the elements of the massive alternately: ");
for(int i = 0;i<arrayLength;i++) {
inputArray[i] = scanner.nextInt();
}
double averageValue =0;
double summary=0;
for (int i = 0; i < arrayLength; i++) {
summary+= inputArray[i];
}
System.out.println("The average value of the massive: " + summary/arrayLength);
}
}