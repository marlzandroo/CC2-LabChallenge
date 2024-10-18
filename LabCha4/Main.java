// Programmer: Marl Zandro T. Andaya
// Date: September 22, 2024
// Laboratory Challenge No. 4: Grocery Store Discount Calculator (Using if-else)
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Create a Scanner Object 
        Scanner scan = new Scanner(System.in);
        
        // Ask the user to input the Total Purchase Amount
        System.out.print("Enter your Total Purchase Amount: PHP ");
        double totalPurchase = scan.nextDouble();
        
        // Variables for Discount
        double discount;
        
        // Apply discount based on the total purchase amount
        if(totalPurchase <= 1000){
            discount = 0.0; // no discount
        }
        else if(totalPurchase >= 1001 && totalPurchase <= 5000){
            discount = 0.05; // 5% discount
        }
        else if(totalPurchase >= 5001 && totalPurchase <= 10000){
            discount = 0.10; // 10% discount
        }
        else{
            discount = 0.15; // 15% discount
        }
        
        // Calculate the Final Price after applying the Discount
        double finalPrice = totalPurchase - (totalPurchase * discount);
        
        // Display the Discount Applied and the Final Price After Discount
        System.out.println("Discount Applied: " + (int)(discount * 100) + "%");
        System.out.println("Final Price After Discount: PHP " + (int)(finalPrice));
        
    }
}