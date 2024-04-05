package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class addElement {
    public static Integer sumElement (ArrayList<Integer> incomingElement) {
        int arraySum = 0;
        for(int eleNum : incomingElement) {
            if (eleNum % 2 == 0) {
                arraySum += eleNum;

            }
        }
        return arraySum;
    }

    public static void printWord (ArrayList<String> incomingArray, int wordL){
      //  String fiveLetterWord="";
        ArrayList <String> listedWord = new ArrayList<>();
        for (String listWord : incomingArray){
            if (listWord.length() == wordL){
                listedWord.add(listWord);

            }


        }
        System.out.println(listedWord);


    }
}
