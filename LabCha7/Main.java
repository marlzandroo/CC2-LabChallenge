// Programmer: Marl Zandro T. Andaya
// Date: October 2nt week 2024
// Laboratory Challenge No. 7: Password Validation System

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Infinite loop to repeatedly prompt for a valid password
        while (true) {
            // Prompt the user to enter their password
            System.out.print("Enter your password: ");
            String password = scan.nextLine();

            // Check if the password meets the criteria:
            // - At least 8 characters long
            // - Contains at least one digit (number)
            // - Contains at least one uppercase letter
            if(password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")){
                // If the password is valid, display success message and exit the loop
                System.out.println("Your password is valid");
                break;  // Exit the loop
            }
            else{
                // If the password is invalid, display error message
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }
        scan.close();
    }
}

