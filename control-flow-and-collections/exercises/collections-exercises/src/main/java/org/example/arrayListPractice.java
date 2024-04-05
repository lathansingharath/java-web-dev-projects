package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class arrayListPractice {
    public static void main(String[] args) {

        ArrayList <Integer> listedNum = new ArrayList<>();
        //the loop below populates the ArrayList above
        for (int i = 1;i < 11;i++) {
            listedNum.add(i);
        }

        System.out.println(listedNum);//test
        int sumList = addElement.sumElement(listedNum);
        System.out.println(sumList);

        ArrayList <String> listedWord = new ArrayList<>();
        listedWord.add("truck");
        listedWord.add("scrappy");
        listedWord.add("bike");
        listedWord.add("sunshine");
        listedWord.add("bagel");

        //The block of code below converts string into an array then an array into a arraylist
        String splitStr = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strSplitting = splitStr.split(" ");
        ArrayList <String> strArrListing = new ArrayList<String>(Arrays.asList(strSplitting));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word length");
        int userLength = input.nextInt();

        addElement.printWord(strArrListing,userLength);
        //System.out.println(pickedWord);






    }


}
