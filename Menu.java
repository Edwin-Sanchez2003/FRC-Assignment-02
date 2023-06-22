/*
 * Java Coding Example
 * Command Line Menu
 * Edwin Sanchez
 * 
 * Description:
 * A program that allows you to do various tasks through a
 * Command Line Menu. You can:
 *      - Edit your bank account
 *      - Rename your dog
 *      - play fetch with the dog
*/

// Scanner - used to read input from the terminal
import java.lang.Math;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Create a scanner object to use to get user input later
        Scanner iScanner = new Scanner(System.in);
        String input = "0"; // user input
        int ballCount = 0; // balls for the dog
        String dogName = "Jerry"; // the name of our dog
        float bankAccountBalance = 0.0f; // how much money we have

        // Display menu to the user until the wish to exit
        boolean keepGoing = true;
        while(keepGoing) {
            // print menu options
            System.out.println("----------------");
            System.out.println("    My Menu     ");
            System.out.println("----------------\n");

            System.out.println("0: Exit");
            System.out.println("1: Edit Bank Account");
            System.out.println("2: Rename Dog");
            System.out.println("3: Play fetch with da dog");
            System.out.println("----------------\n");

            // get input from the user
            // blocks execution of code - waits for user input in the terminal
            input = iScanner.nextLine();
            
            // check user input
            if(input.equals("0")) { // end while loop - exit the program
                System.out.println("Goodbye!");
                keepGoing = false;
            } else if(input.equals("1")) { // Edit Bank Account

                // print out the user's current bank account
                System.out.println(
                    String.format(
                        "Your current balance is: $%f", 
                        bankAccountBalance
                    ) // end formatted string
                ); // end print command

                // get new account balance from the user
                bankAccountBalance = Float.parseFloat(iScanner.nextLine());

                // print new account balance
                // print out the user's current bank account
                System.out.println(
                    String.format(
                        "Your current balance is: $%f", 
                        bankAccountBalance
                    ) // end formatted string
                ); // end print command
            } else if(input.equals("2")) { // Rename Dog
                
                // print out current dog name
                System.out.println("Current Dog Name: " + dogName);

                // prompt the user to enter a new name for da dog
                System.out.println("Please enter a new name for da dog:");
                dogName = iScanner.nextLine();

                // print out the new name
                System.out.println("Current Dog Name: " + dogName);

            } else if (input.equals("3")) { // play fetch
                
                // prompt user to ask how many balls they want to throw to the dog
                System.out.println("Enter a number for how many balls to throw:");
                ballCount = Integer.parseInt(iScanner.nextLine());

                // use to count the number of balls caught by the dog
                int ballsCaught = 0;

                // throw the ball to da dog ballCount number of times
                for(int i = 0; i < ballCount; i++) {
                    System.out.println("Fetch!");

                    // check if the dog caught the ball
                    if(Math.random() < 0.5) {
                        System.out.println(dogName + " caught the ball!!!");
                        ballsCaught += 1;
                    } // end if
                } // end for

                // print out the number of balls caught by the dog
                System.out.println("Total balls caught by " + dogName + " : " + ballsCaught);
            } else { // tell user their input was incorrect
                String output = "I'm sorry, but '" + input + "' is not a valid input.";
                System.out.println(output);
            } // end if
        } // end while

        // close the scanner
        iScanner.close();
    } // end main
} // end Menu class
