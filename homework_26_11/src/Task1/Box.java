package Task1;

import static java.lang.Math.*;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Box {
    int height;
    int width;
    int length;
    int volume;
    public void searchVolume(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please, enter the height of the box, sm: ");
        int height = inputScanner.nextInt();
        System.out.print("Please, enter the width of the box, sm: ");
        int width = inputScanner.nextInt();
        System.out.print("Please, enter the length of the box, sm: ");
        int length = inputScanner.nextInt();
        System.out.println("");
        System.out.print("The volume of the box: "+(height*width*length)+" cubic sm.");

    }
}
