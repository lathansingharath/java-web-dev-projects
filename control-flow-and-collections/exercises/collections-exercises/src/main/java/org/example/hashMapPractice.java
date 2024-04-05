package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class hashMapPractice {
    public static void  main (String[] args){
        HashMap <Integer,String> studentInfo = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int studentId;
        String studentName;

        do {
            System.out.println("Please enter your Name");
            studentName = input.nextLine();

            if (!studentName.equals("")){

                System.out.println("Please enter your ID");

                studentId = input.nextInt();
                studentInfo.put(studentId,studentName);

                input.nextLine();

            }
        } while (!studentName.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer,String> student : studentInfo.entrySet()){

            System.out.println(student.getKey() + " " + student.getValue() );
        }



    }


}
