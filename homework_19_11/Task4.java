import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль все елементы командной строки,а если их нету выводит сообщение что их кол-во равно нулю
public class Task4 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter array length: ");
int arrayLength = input.nextInt();
int inputArray[] = new int[arrayLength];
if (arrayLength == 0) {
System.out.println("0");
} else {
System.out.println("Input array elements:");
for (int i = 0; i < arrayLength; i++) {
inputArray[i] = input.nextInt();
}
System.out.print("Input array elements are:");
for (int i = 0; i < arrayLength; i++) {
System.out.print(" " + inputArray[i]);
}
System.out.println();
}
}
}