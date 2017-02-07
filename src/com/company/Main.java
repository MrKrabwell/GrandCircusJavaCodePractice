package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    // public fields
    static Scanner scnr = new Scanner(System.in);
    static Random rand = new Random();

    /****************************************************************
     * getValidFloat function to validate that it is an float value *
     ****************************************************************/
    public static float getValidFloat() {

        // This keeps looping until floateger input is received.
        while (!scnr.hasNextFloat()) {
            scnr.nextLine();         // clear the buffer
            System.out.println("Please enter a valid value!");
        }

        float userInput = scnr.nextFloat();
        scnr.nextLine();  // clear buffer

        return userInput;
    }
    
    /****************************************************************
     * getValidInteger function to validate that it is an int value *
     ****************************************************************/
    public static int getValidInteger() {
        

        // This keeps looping until integer input is received.
        while (!scnr.hasNextInt()) {
            scnr.nextLine();         // clear the buffer
            System.out.println("Please enter an integer!");
        }

        int userInput = scnr.nextInt();
        scnr.nextLine();  // clear buffer

        return userInput;
    }


    /*************************************************************************
     * getValidInteger to and check for a range, user with getValidInteger() *
     *************************************************************************/
    public static int getValidInteger(int min, int max) {

        int userInput = getValidInteger();

        while (userInput < min || userInput > max) {
            System.out.println("Please enter a number within range!");
            userInput = getValidInteger();
        }

        return userInput;
    }


    // Convert an upper case letter to a lower case letter
    public static void convertUpperChartToLower() {
        // Description of method
        System.out.println("Convert an upper-case letter to a lower case letter.");

        // Create arbitrary characters to convert to lower case
        char c1 = 'A';
        char c2 = 'B';
        char c3 = 'C';

        System.out.printf("The three upper-case letters to convert are %c, %c, and %c\n", c1, c2, c3);
        System.out.printf("The lower case of these are %c, %c, and %c\n\n",
                Character.toLowerCase(c1), Character.toLowerCase(c2), Character.toLowerCase(c3));

        return;
    }


    // For any given integer, determine whether it is odd or even
    public static void determineIntegerOddEven() {
        // Description of method
        System.out.println("For any given integer, determine whether it is odd or even.");

        // Get integer from user and determine odd or even
        System.out.print("Please enter an integer: ");
        if (getValidInteger() % 2 == 0) {
            System.out.println("That integer is even.\n");
        }
        else {
            System.out.println("That integer is odd.\n");
        }
        return;
    }


    // For any given (small) number, print a square of asterisks with the
    // length of each side equal to the given number
    public static void printAsteriskSquare() {
        // range of user input, i.e. number of astrisk per square
        int min = 1;
        int max = 15;

        // Description of method
        System.out.println("For any given (small) number, print a square of asterisks with the " +
                "length of each side equal to the given number");

        // get size of each side from user
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int sides = getValidInteger(min, max);

        // print the asterisk square based on user input
        for (int i = 0; i < sides; i++) {
            for (int j = 0; j < sides; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        return;
    }


    // Simulate tossing a coin
    public static void coinToss() {

        // Description of method
        System.out.println("Simulate tossing a coin.");

        // Toss coin
        System.out.println("Coin tossed! ");
        if (rand.nextInt(2) == 0) {
            System.out.println("It's Heads!\n");
        }
        else {
            System.out.println("It's Tails!\n");
        }

        return;
    }


    // Given a number from 1-12, return the name of the appropriate month
    public static void numMonthConverter() {
        // Variable declarations
        String[] monthNames = {    // Array to hold the names of the month
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"};

        // Description of method
        System.out.println("Given a number from 1-12, return the name of " +
                "the appropriate month.");

        // Prompt user to input a number and get number
        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = getValidInteger(1,12);
        
        // Get the ordinal
        String ordinal = "";
        if (monthNumber == 1) {
             ordinal = "st";
        }
        else if (monthNumber == 2) {
             ordinal = "nd";
        }
        else if (monthNumber == 3) {
             ordinal = "rd";
        }
        else {
             ordinal = "th";
        }

        // Tell the user the result
        System.out.println("The " + monthNumber + ordinal + " month is " +
                monthNames[monthNumber - 1] + ".\n");

        return;
    }


    // Randomly generate an integer within a given range
    public static void generateRandomNumInRange() {
        // Variable declarations
        int userMin = 0;
        int userMax = 0;

        // Description of method
        System.out.println("Randomly generate an integer within a given range.");

        // Prompt user to enter the ranges
        System.out.print("Enter the lower limit: ");
        userMin = getValidInteger();
        System.out.print("Enter the upper limit: ");
        userMax = getValidInteger();

        // Don't let the user mix up the upper and lower limit
        while (userMin > userMax) {
            System.out.print("Your upper limit must be greater than the " +
            "lower limit. \nPlease enter the upper limit: ");
            userMax = getValidInteger();
        }

        // Print the results to the user
        System.out.println("Your random number between " + userMin +
        " and " + userMax + " is " + (rand.nextInt(userMax-userMin+1)+userMin) + ".\n");

        return;
    }


    // This method determines whether a value is positive or negative
    public static boolean isPositive(float number) {
        if (number > 0) {
            return true;
        }
        else {
            return false;
        }
    }


    // Create a method that takes a value and indicates whether it is
    // positive or negative by a return to boolean
    // This void method will call the boolean method above this method
    public static void getNumberToFindPositive() {
        // Description of method
        System.out.println("Create a method that takes a value and indicates whether it is " +
                "positive or negative by a return to boolean.");

        // Get user input, and determine whether positive or not by the isPositive method
        System.out.print("Enter a value: ");
        if (isPositive(getValidFloat())) {
            System.out.println("Your number is positive according to method " +
                    "boolean isPositive(float a).\n");
        }
        else {
            System.out.println("Your number is not positive according to method " +
                    "boolean isPositive(float a).\n");
        }

        return;
    }


    // This method determines whether a value is zero or not.
    public static boolean isZero(float number) {
        if (Math.abs(number) < 0.00001) {
            return true;
        }
        else {
            return false;
        }
    }


    // Create a method that takes a value and tell whether it is zero or not
    // This void method will call the boolean method above this method
    public static void getNumberToFindIsZero() {
        // Description of method
        System.out.println("Create a method that takes a value and " +
                "tell whether it is zero or not.");

        // Get user input, and determine whether zero or not by the isZero method
        System.out.print("Enter a value: ");
        if (isZero(getValidFloat())) {
            System.out.println("Your number is zero according to method " +
                    "boolean isZero(float a).\n");
        }
        else {
            System.out.println("Your number is not zero according to method " +
                    "boolean isZero(float a).\n");
        }

        return;
    }


    // This method determines the larger of two values
    public static float largerOfTwoNumbers(float num1, float num2) {
        if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }


    // Create a method that takes two numbers and returns the largest value
    // This void method will call the float method above this method.
    public static void getNumbersToFindLargerOfTwo() {
        // Variable declarations
        float userNumber1 = 0;       // store the user input number 1
        float userNumber2 = 0;       // stores the user input number 2

        // Description of method
        System.out.println("Create a method that takes two numbers and returns " +
                "the larger value.");

        // Prompt the user to input the two numbers
        System.out.print("Enter your first number: ");
        userNumber1 = getValidFloat();
        System.out.print("Enter your second number: ");
        userNumber2 = getValidFloat();

        //User the method to etermine the largest value and print the result
        System.out.println("The larger of " + userNumber1 + " and " +
                userNumber2 + " is " + largerOfTwoNumbers(userNumber1,userNumber2) +
                " according to the method float largerOfTwoNumbers(float a, float b).\n");

        return;
    }


    // This method determines the smaller of two values
    public static float smallerOfTwoNumbers(float num1, float num2) {
        if (num1 < num2) {
            return num1;
        }
        else {
            return num2;
        }
    }


    // Create a method that takes two numbers and returns the lowest value
    // This void method will call the float method above this method
    public static void getNumbersToFindSmallerOfTwo() {
        // Variable declarations
        float userNumber1 = 0;       // store the user input number 1
        float userNumber2 = 0;       // stores the user input number 2

        // Description of method
        System.out.println("Create a method that takes two numbers and returns " +
                "the smaller value.");

        // Prompt the user to input the two numbers
        System.out.print("Enter your first number: ");
        userNumber1 = getValidFloat();
        System.out.print("Enter your second number: ");
        userNumber2 = getValidFloat();

        //User the method to determine the smaller value and print the result
        System.out.println("The smaller of " + userNumber1 + " and " +
                userNumber2 + " is " + smallerOfTwoNumbers(userNumber1,userNumber2) +
                " according to the method float smallerOfTwoNumbers(float a, float b).\n");

        return;
    }


    // Write a Java program to convert temperature from Fahrenheit to Celsius deree
    public static void convertFtoCTemp() {
        // Variable declarations
        float userTempF = 0;        // user variable to store F temperature
        float convertedTempC = 0;   // temperature in C that has been converted

        // Description of method
        System.out.println("Write a Java program to convert temperature from " +
                "Fahrenheit to Celsius degree.");

        // Get user input
        System.out.print("Enter temperature in Fahrenheit to convert: ");
        userTempF = getValidFloat();

        // Get the converted C temp
        convertedTempC = (userTempF - 32.0f) * 5.0f / 9.0f;

        // Print the result
        System.out.println(userTempF + "\u00b0F is " + convertedTempC + "\u00b0C.\n");

        return;
    }


    // Write a Java program that reads an integer between 0 and 1000 and
    // adds all the digits in the integer
    public static void addDigitsOfInteger() {
        // Variable declarations
        int min = 0;                // These define the range of user input
        int max = 1000;             // These define the range of user input
        int userNumber = 0;         // Holds the user number
        int tempNumber = 0;         // Holds the temporary number for calculating
        int sumDigits = 0;          // Holds the sum of the digits

        // Description of method
        System.out.println("Write a Java program that reads an integer between " +
                min + " and " + max + " and adds all the digits in the integer");

        // Get the user input
        System.out.print("Enter an integer between " + min + " and " + max + ": ");
        userNumber = getValidInteger(min,max);
        tempNumber = userNumber;

        // Add the digits by using modulo
        while (tempNumber % 10 != 0) {
            sumDigits += (tempNumber % 10);
            tempNumber /= 10;
        }

        // Print the results
        System.out.println("The sum of all digits of " + userNumber + " is " +
                sumDigits + ".\n");

        return;
    }


    // For any given pair of integers, determine if the second is a multiple
    // of the first
    public static void determinePairIntIsMultiple() {
        // Variable declarations
        int userNumber1 = 0;        // user inputted first number
        int userNumber2 = 0;        // user inputted second number

        // Description of method
        System.out.println("For any given pair of integers, determine if the second " +
                "is a multiple of the first.");

        // Get user input
        System.out.print("Enter the first number: ");
        userNumber1 = getValidInteger();
        System.out.print("Enter the second number: ");
        userNumber2 = getValidInteger();

        // Determine whether the second number is a multiple of the first,
        // And let the user know of the result
        if ((userNumber2 % userNumber1) == 0) {
            System.out.println(userNumber2 + " is a multiple of " + userNumber1 + ".\n");
        }
        else {
            System.out.println(userNumber2 + " is NOT a multiple of " + userNumber1 + ".\n");
        }

        return;
    }


    // Randomly select a letter in the alphabet
    public static void randomLetterInAlphabet() {
        // Variable declarations
        String alphabet = "abcdefghijklmnopqrstuvwxyz" +     // holds the alphabet
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Description of method
        System.out.println("Randomly select a letter in the alphabet.");

        // Print the result
        System.out.println("Your random letter is '" + alphabet.charAt(rand.nextInt(alphabet.length())) + "'.\n");

        return;
    }


    // This method return the smallest of three values
    public static float getSmallestOfThreeValues(float num1, float num2, float num3) {
        return Math.min(num1, Math.min(num2, num3));
    }


    // Create a method that takes 3 numbers and return the smallest value,
    // use the Math.min().
    public static void getNumbersToFindSmallerOfThree() {
        // Variable declarations
        float userNumber1 = 0.0f;       // stores first user input
        float userNumber2 = 0.0f;       // stores second user input
        float userNumber3 = 0.0f;       // stores third user input

        // Description of method
        System.out.println("Create a method that takes 3 numbers and " +
                "return the smallest value, use the Math.min().");

        // Get user inputs
        System.out.print("Enter the first number: ");
        userNumber1 = getValidFloat();
        System.out.print("Enter the second number: ");
        userNumber2 = getValidFloat();
        System.out.print("Enter the third number: ");
        userNumber3 = getValidFloat();

        // Print results to user
        System.out.printf("The smallest of %.3f, %.3f, and %.3f, is %.3f.\n\n",
                userNumber1, userNumber2, userNumber3,
                getSmallestOfThreeValues(userNumber1,userNumber2,userNumber3));

        return;
    }


    /*************************************************************************
     * This method asks the user if they want to continue the program or not *
     *************************************************************************/
    public static boolean askUserToContinue() {
        // Variable declarations
        String userInput = "";                  // User input string
        Scanner scan = new Scanner(System.in);  // Scanner object for user input

        // Prompt user to enter yes or no
        System.out.print("Do you want to continue? (y/n): ");
        userInput = scan.nextLine();
        System.out.println("");

        // Validate whether user input is ok, and continue asking until right
        while (!userInput.equalsIgnoreCase("y") &&
                !userInput.equalsIgnoreCase("yes") &&
                !userInput.equalsIgnoreCase("n") &&
                !userInput.equalsIgnoreCase("no")) {
            System.out.println("That is not a valid input.  Please try again. ");
            System.out.print("Do you want to continue? (y/n): ");
            userInput = scan.nextLine();
            System.out.println("");
        }

        // Return true if user says yes, and false if user says no
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }


    // This is the main program
    public static void main(String[] args) {

        // Welcome message
        System.out.println("Welcome to the Grand Circus Java Code Practice!\n");

        while (true) {
            // Convert an upper case letter to a lower case letter
            convertUpperChartToLower();

            // For any given integer, determine whether it is odd or even
            determineIntegerOddEven();

            // For any given (small) number, print a square of asterisks with the
            // lengthof each side equal to the given number
            printAsteriskSquare();

            // Simulate tossing a coin
            coinToss();

            // Given a number from 1-12, return the name of the appropriate month
            numMonthConverter();

            // Randomly generate aninteger within a given range
            generateRandomNumInRange();

            // Create a method that takes a value and indicate whether it is
            // positive or negative by a return to boolean
            // This will call a void method that will call a boolean method
            getNumberToFindPositive();

            // Create a method that takes a value and tell whether it is null or not.
            // This will call a void method that will call a boolean method
            getNumberToFindIsZero();

            // Create a method that takes two numbers and returns the largest value.
            // This will call a method that will return a larger value
            getNumbersToFindLargerOfTwo();

            // Create a method that takes two numbers and returns the lowerst value.
            // This will call a method that will return a smaller value
            getNumbersToFindSmallerOfTwo();

            // Create a method that takes three numbers and returns the largest value,
            // use the Math.max()
            // This will call a method that will return the lowest
            getNumbersToFindSmallerOfThree();

            // Write a Java program to convert temperature from Fahrenheit to Celsius degree
            convertFtoCTemp();

            // Write a Java program that reads an integer between 0 and 1000 and
            // adds all the digits in the integer
            addDigitsOfInteger();

            // For any given pair of integers, determine if the second is a multiple
            // of the first
            determinePairIntIsMultiple();

            // Randomly select a letter in the alphabet
            randomLetterInAlphabet();

            // Ask user if they want to continue
            if (!askUserToContinue()) {
                break;
            }
        }

        // Exit message
        System.out.println("Goodbye!");

    }
}
