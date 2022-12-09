import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль массив чисел от n до 1,где n-число заданное из потока ввода-вывода класса Сканер,если n=0или n< 0-вывести на екран сообщение что число не валидно и запросить новый ввод
public class Task2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter number N: ");
int numberN = input.nextInt();
//int[] Array = new int[];
 if (numberN < 0 || numberN == 0) {
System.out.println("The number is not valid. Try again!");
} else {
for (int i = numberN; i >=1; i--) {
System.out.print(i + " ");
}
}
}
}