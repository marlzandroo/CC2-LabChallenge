//Programmer: Marl Zandro T. Andaya
//Sep 12, 2024
//Laboratory Challenge No. 3: Grocery Shopping Calculator

import java.util.Scanner; // Import the Scanner class for user input

public class LabNo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the price and quantity of item 1
        System.out.print("Enter the price of item 1: ");
        int item1 = scan.nextInt(); 
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = scan.nextInt(); 

        // Prompt the user to enter the price and quantity of item 2
        System.out.print("Enter the price of item 2: ");
        int item2 = scan.nextInt(); 
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = scan.nextInt(); 

        // Prompt the user to enter the price and quantity of item 3
        System.out.print("Enter the price of item 3: ");
        int item3 = scan.nextInt(); 
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = scan.nextInt(); 

        // Calculate the subtotal by multiplying prices by quantities and summing them
        double subTotal = (item1 * quantity1) + (item2 * quantity2) + (item3 * quantity3);
        // Calculate a 5% discount on the subtotal
        double disCount = subTotal * 0.05;
        // Calculate the subtotal after applying the discount
        double subDiscount = subTotal - disCount;
        // Calculate a 12% sales tax on the discounted subtotal
        double salesTax = subDiscount * 0.12;
        // Calculate the final total by adding the sales tax to the discounted subtotal
        double finalTotal = subDiscount + salesTax;

        // Print the calculated amounts to the console
        System.out.println("\nSubtotal : PHP " + subTotal + "0");
        System.out.println("Discount : PHP " + disCount + "0");
        System.out.println("Sales Tax : PHP " + salesTax + "0");
        System.out.println("Final Total: PHP " + finalTotal + "0");
    }
}