package org.launchcode;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of a circle ");
        // input.close();

        if (input.hasNextDouble()) {
            double userRadius = input.nextDouble();
            double areaCircle = Circle.getArea(userRadius);
            System.out.println(("The area of the circle with radius of "+userRadius+ " is "+areaCircle));
        } else {
            System.out.println("Invalid Input ");
        }



        //double areaCircle = Circle.getArea(userRadius);
        //System.out.println(("The area of the circle with radius of "+userRadius+ " is "+areaCircle));


    }


}
