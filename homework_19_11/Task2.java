import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//�������� ����� ������� ������� � ������� ������ ����� �� n �� 1,��� n-����� �������� �� ������ �����-������ ������ ������,���� n=0��� n< 0-������� �� ����� ��������� ��� ����� �� ������� � ��������� ����� ����
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