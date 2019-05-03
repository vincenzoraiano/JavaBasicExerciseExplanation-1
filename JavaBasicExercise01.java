package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Instantiate a Scanner object with name myScanner
        //This is an object
        //Scanner is the class, and myScanner is the name of the object.
        Scanner myScanner=new Scanner(System.in);

        //Asking for enter the first name.
        System.out.println("Enter the first name:");

        //Store the input entered by the user inside the String firstLine
        //This is creating a variable of type String, and use this string like a strongbox.
        String firstName=myScanner.nextLine();

        //Asking to enter the surname to the user.
        System.out.println("Enter the surname ");

        //This will store the value entered by the user inside the surname variable of type string.
        //This is creating a variable of type String, and use this string like a strongbox.
        String surName=myScanner.nextLine();


        //This will first call the method and use the inputs entered by the user.
        //This is first calling the method and then use the firstName and surName as arguments for the method.
        System.out.println(stringChecker(firstName,surName));

        //This will call the charactersCount method and use the 2 inputs from as a parameters for the method.
        System.out.println(charactersCount(firstName,surName));

        //THis is using the LocalDateTime class and the method now() for hold the time when the data has been entered.
        System.out.println("the name and surname were added on "+LocalDateTime.now());

    }
    //Creating a method that use the input entered by the user like parameters.
    public static String stringChecker(String firstName, String surName){
        return "The entered name and surname are= "+ (firstName+" "+ surName) ;
    }
    //There is creating a method that is gonna counter the number of letters.
    public static int charactersCount(String firstName,String surName){
        int counterCharacter=firstName.length()+surName.length();
        System.out.print("The number of charachter is = ");
        return counterCharacter;

    }



}
