package org.launchcode;
import java.util.Scanner;

public class AliceSentence {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String aliceLine = ("Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’").toLowerCase();

        System.out.println("Please enter a word");
        String userWord = (input.next()).toLowerCase();
        input.close();

        if(aliceLine.contains(userWord)) {
            System.out.println("Yay, that word is in the first Alice in Wonderland sentence");
            System.out.println("The index of "+userWord+" is " + aliceLine.indexOf(userWord));
            System.out.println("Its length is " +userWord.length());
            String newAliceSentence = aliceLine.replaceAll(userWord,"");

            System.out.println("The original Alice sentence is \n"+aliceLine);
            System.out.println("The new Alice line with the word "+userWord+" taken out \n" + newAliceSentence);


        } else {
            System.out.println("That word is not in the first Alice in Wonderland sentence");
        }









    }
}
