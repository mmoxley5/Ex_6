import java.util.Scanner;

/* Write a class that can be used to collect user input 
and has three methods:

public String promptString(String message)
public int promptInt(String message)
public double promptDouble(String message)
Each of these methods should prompt the user 
for input using the specified message and return 
the a String, int, or double, depending on the method. 
The methods should catch any exceptions due to bad input 
and continue to prompt the user for input until valid input 
is supplied. */


public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int aNumber = promptInt();
        System.out.println("Your # is " + aNumber);

        String aString = promptString();
        System.out.println("Your String is "+ aString);

        double aDouble = promptDouble();
        System.out.println("Your double "+ aDouble);

    }


    static int promptInt() {
        System.out.println("Enter an int..");
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. ");
                userInput = scanner.nextLine();
            }
        }

        return userInt;
    }

    static String promptString() {
        System.out.println("Enter a String: ");
        String UserInput = scanner.nextLine();
        boolean isString = false;
        while(isString == false){
            try {
                Double.parseDouble(UserInput);
                isString = false;

            } catch (NumberFormatException e) {
                System.out.println("You entered a String!");
                isString = true;
                break;
            }
            System.out.println("Try again...Enter a valid String: ");
            UserInput = scanner.nextLine();

        }
        
        return UserInput;
    }
    static double promptDouble() {
        System.out.println("Enter an double..");
        String userInput = scanner.nextLine();

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " );

            }
        }
        return userDouble;
    }
}