// Programmer: Marl Zandro T. Andaya
// Date: September 3rd week, 2024
// Laboratory Challenge No. 5: Restaurant Order System

import java.util.Scanner;

public class LabNo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int choice; 
        double quantity;
        
        System.out.println("MENU");
        System.out.println("1. Burger    - PHP 100");
        System.out.println("2. Fries     - PHP 50");
        System.out.println("3. Soda      - PHP 30");
        System.out.println("4. Ice Cream - PHP 45");
        System.out.println("5. EXIT");

        // Keep prompting the user for a valid menu choice
        while (true) {
            // Prompt the user to enter their menu choice
            System.out.print("\nEnter the menu number of your choice: ");
            choice = scan.nextInt(); 

            // If the user chooses to exit
            if (choice == 5) {
                System.out.println("Thank you! Come again!"); // Thank the user
                return;  // Exit the program
            }

            // Check if the choice is valid (between 1 and 4)
            if (choice >= 1 && choice <= 4) {
                break; 
            } 
            else {
                System.out.println("Invalid Input. Please choose a number between 1 and 5."); 
            }
        }

        // Prompt the user to enter the quantity for their order
        System.out.print("Enter the quantity of your choice: ");
        quantity = scan.nextDouble();

        double totalPrice = 0.0; 

        // Calculate total price based on the user's choice
        switch (choice) {
            case 1:
                totalPrice = 100 * quantity; 
                System.out.println("You ordered Burger. ");
                break;
            case 2:
                totalPrice = 50 * quantity; 
                System.out.println("You ordered Fries. ");
                break;
            case 3:
                totalPrice = 30 * quantity; 
                System.out.println("You ordered a Soda. ");
                break;
            case 4:
                totalPrice = 45 * quantity; 
                System.out.println("You ordered Ice Cream. ");
                break;
        }

        System.out.println("Total Amount: " + (int)(totalPrice) + " PHP"); 
        scan.close(); 
    }
}