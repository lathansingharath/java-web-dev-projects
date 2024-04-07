package org.example;
import java.util.HashMap;
import java.util.Map;
import  java.util.Scanner;

public class countingLetters {

    public static void  main(String[] args) {

        String countString = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has to be " +
                "zero to start with. So if you move all the terms over to one " +
                "side, you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";
//////////////////////////////////The codes between the comment lines are for user input.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String stringInput = input.nextLine();
        char[] charInput = stringInput.toCharArray();
        HashMap<Character,Integer> inputCountingCh = new HashMap<>();


        for (char inputLetter : charInput){
            int counter=0;
            if (!inputCountingCh.containsKey(inputLetter)) {
                for (int i = 0;i < charInput.length; i++){
                    if (inputLetter == charInput[i]) {
                        counter += 1;
                    }
                }
                inputCountingCh.put(inputLetter,counter);
            }
        }

        for (Map.Entry<Character,Integer> userLetterCount : inputCountingCh.entrySet()) {
            if(!userLetterCount.getKey().equals(' ')) {
                System.out.println(userLetterCount.getKey()+ ": " +userLetterCount.getValue());
            }
        }

        System.out.println("\n");



////////////////////////////////////////////////////////////////
        char[] stringChar = countString.toCharArray();
        HashMap<Character,Integer> countingCh = new HashMap<>();

        for (char letter : stringChar){
            int counter=0;
            if (!countingCh.containsKey(letter)) {
                for (int i = 0;i < stringChar.length; i++){
                    if (letter == stringChar[i]) {
                        counter += 1;
                    }
                }
                countingCh.put(letter,counter);
            }
        }
        System.out.println(countString);
        for (Map.Entry<Character,Integer> letterCount : countingCh.entrySet()) {
            if(!letterCount.getKey().equals(' ')) {
                System.out.println(letterCount.getKey()+ ": " +letterCount.getValue());
            }
        }

    }
}
