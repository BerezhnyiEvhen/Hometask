import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

class Task8 {
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
System.out.println("Please enter the year:");
int year = myObj.nextInt();
int century = (year/100)+1;
System.out.println(" ");
System.out.println("This is " + century + " century");
}
}
}
