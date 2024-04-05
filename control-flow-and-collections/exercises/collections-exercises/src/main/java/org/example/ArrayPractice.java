package org.example;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        String splitStr = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        System.out.println(splitStr); //testing
        String[] splitStrArr = splitStr.split("\\.");
        System.out.println(Arrays.toString(splitStrArr));
       // System.out.println(splitStrArr[2]);//testing


        int[] arrayPractNums = {1,1,2,3,5,8};
        for (int arrayNum : arrayPractNums) {

            if (arrayNum % 2 != 0) {
                System.out.println(arrayNum);

            }

        }



    }

}
