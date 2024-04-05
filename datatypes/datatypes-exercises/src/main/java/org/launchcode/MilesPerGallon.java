package org.launchcode;
import java.util.Scanner;


public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter the miles you have driven ");
        int milesDriven = input.nextInt();
        System.out.print("How many gallon of gas did you consume ? ");
        int gallonsConsumed = input.nextInt();
        input.close();

        float mpg = milesDriven/gallonsConsumed;

        System.out.print("Your MPG is " + mpg);



    }
}
