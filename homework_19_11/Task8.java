import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

/*написать программу которая принимает из потока ввода-вывода два значения:высота и ширина двумерного массива,
создает два двумерных массива на основании этих значений,заполняет оба массива рандомными числами от 0до 100
и произвести сложение данных массивов(результатом будет некий третий массив) с выведение результата на экран
(например значение из ячейки[0][0]складывается с соотв значением из второго массива),
значение высоты и ширины не может быть меньше 3и больше 5*/
public class Task8 {
public static void main(String args[]) {
Scanner inputScanner = new Scanner(System.in);
System.out.print("Please, enter the array`s height: ");
int height = inputScanner.nextInt();
System.out.print("Please, enter the array`s width: ");
int width = inputScanner.nextInt();
int[][] arrayOne = new int[height][width];
int[][] arrayTwo = new int[height][width];
int[][] arrayResult = new int[height][width];
//int arrayResult=arrayOne[][]+arrayTwo[][];
for (int i = 0; i < arrayOne.length; i++) {
for (int j = 0; j < arrayOne[i].length; j++) {
arrayOne[i][j] = (int) (Math.random() * 100);
System.out.print(arrayOne[i][j] + "  ");
}
System.out.println(" ");
}
System.out.println(" ");
for (int i = 0; i < arrayTwo.length; i++) {
for (int j = 0; j < arrayTwo[i].length; j++) {
arrayTwo[i][j] = (int) (Math.random() * 100);
System.out.print(arrayTwo[i][j] + "  ");
}
System.out.println(" ");
}
System.out.println(" ");
for (int i = 0; i < arrayResult.length; i++) {
for (int j = 0; j < arrayResult[i].length; j++) {
arrayResult[i][j] = arrayOne[i][j] + arrayTwo[i][j];
System.out.print(arrayResult[i][j] + "  ");
}
System.out.println(" ");
}
}
}
