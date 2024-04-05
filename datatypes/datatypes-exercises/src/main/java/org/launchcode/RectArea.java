package org.launchcode;
import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle ");
        int recLength = input.nextInt();
        System.out.println("Please enter the width of the rectangle ");
        int recWidth = input.nextInt();
        input.close();

        System.out.println("The area of the rectangle is "+(recLength * recWidth));



    }
}
