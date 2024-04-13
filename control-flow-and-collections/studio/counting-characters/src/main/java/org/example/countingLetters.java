package org.example;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import  java.util.Scanner;
import java.io.File;

public class countingLetters {

    public static void  main(String[] args) {

        String countString = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has to be " +
                "zero to start with. So if you move all the terms over to one " +
                "side, you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";

       /////////// //The next block of code will be attempting to read a string from a file
        try {

            File myFile = new File("C:\\Users\\singh\\Documents\\NewLaunchCode\\java-practice\\java-web-dev-projects\\control-flow-and-collections\\studio\\counting-characters\\Test file for reading Java.txt");
            Scanner readMyFile = new Scanner (myFile);

           // System.out.println(myFile.getAbsoluteFile());//testing
            System.out.println(myFile.getName() + " can be read");
            System.out.println(readMyFile.nextLine());


        } catch (FileNotFoundException fileError) {
            System.out.println("An error has occured " + fileError);

            fileError.printStackTrace();
        }
        /*File myFile = new File("Test file for reading Java.txt");
        Scanner readMyFile = new Scanner (myFile);

        System.out.println(myFile.getAbsoluteFile());
        System.out.println(myFile.getName() + " can be read");*/

   ////////////////////////////////////////////////////////////////

//////////////////////////////////The codes between the comment lines are for user input.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String stringInput = (input.nextLine()).toLowerCase(); //this converts it to lowercase
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
        int letsCountLetters = 0;
        for (Map.Entry<Character,Integer> userLetterCount : inputCountingCh.entrySet()) {
            if(!userLetterCount.getKey().equals(' ') && Character.isAlphabetic(userLetterCount.getKey())) {
                System.out.println(userLetterCount.getKey()+ ": " +userLetterCount.getValue());
                letsCountLetters++;
            }
        }
        System.out.println("In total, there are "+letsCountLetters+" letters");


       // System.out.println("\n");
        /* The block of code below is for testing
        if (!Character.isAlphabetic(charInput[0])) {
            System.out.println(("It is not a letter"));
        } else {
            System.out.println("It is a letter");
        }*/

////////////////////////////////////////////////////////////////
        char[] stringChar = countString.toCharArray();
        HashMap<Character,Integer> countingCh = new HashMap<>();
        /*
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
        System.out.println(countString);//testing
        for (Map.Entry<Character,Integer> letterCount : countingCh.entrySet()) {
            if(!letterCount.getKey().equals(' ')) {
                System.out.println(letterCount.getKey()+ ": " +letterCount.getValue());
            }
        }*/

    }
}
