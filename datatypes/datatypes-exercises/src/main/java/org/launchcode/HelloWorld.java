package org.launchcode;
import java.util.Scanner;


public class HelloWorld {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println(("Hi, what is your name? "));
        String userName = input.nextLine();
        input.close();
        System.out.println("Hello, " + userName);


    }

}
