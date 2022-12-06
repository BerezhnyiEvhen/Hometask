import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль сумму чисел елементов массива с плавающей точкой.Числа могут быть отрицательными или нецелыми.Если длина массива равна нулю,вы должны вернуть 0. Длина массива и значение елементов задается рандомно
public class Task3 {
public static void main(String[] pars) {
Scanner scanner = new Scanner(System.in);
System.out.println("Please input amount of elements of the massive:  ");
int arrayLength = scanner.nextInt();
if (arrayLength == 0) {
System.out.println("0");
} else {
double[] inputArray = new double[arrayLength];
System.out.println("Please input the elements of the massive alternately: ");
for (int i = 0; i < arrayLength; i++) {
inputArray[i] = scanner.nextDouble();
}
double summary = 0;
for (int i = 0; i < arrayLength; i++) {
summary += inputArray[i];
}
System.out.println("The summary of the massive: " + summary);
}
}
}