import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

//написать класс который выводит в консоль массив состоящий из двух елементов. 1й - кол-во  всех позитивных значений массива, 2й - сумма всех отрицательных. Массив вводится с консоли
class Task9 {
public static void main(String[] args) {
Scanner inputScanner = new Scanner(System.in);
System.out.println("Input the amount of elemnts of new massive: ");
int arrayLength = inputScanner.nextInt();
int[] inputArray = new int[arrayLength];
System.out.println("Input the elemnts of new massive: ");
for (int i = 0; i < arrayLength; i++) {
inputArray[i]=inputScanner.nextInt();
}
int[] resultArray=new int[2];
int amountOfPositive=0;
int sumOfNegative=0;
for (int i = 0; i < arrayLength; i++) {
if(inputArray[i]>0){
amountOfPositive++;
}else if(inputArray[i]<0) {
sumOfNegative += inputArray[i];
}
}
resultArray[0]=amountOfPositive;
resultArray[1]=sumOfNegative;
System.out.println("The amount of positive values: " + amountOfPositive+" , the summary of negative values: "+sumOfNegative);
}
}