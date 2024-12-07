// Programmer: Marl Zandro T. Andaya
// Date: November 7, 2024
// Final Challenge No. 1: Retail Store Inventory Management (1D array)

import java.util.Scanner;

public class FinalNo1 {
    public static void main(String[] args) {
        // Arrays to hold stock levels and prices for each product
        int[] stockLevels = {10, 20, 5, 15, 10, 12, 25, 10, 15, 30};
        double[] prices = {5.5, 3.50, 12.00, 7.25, 10.0, 4.50, 2.00, 9.50, 6.75, 1.25};

        // Variable to keep track of the total value of all items in stock
        double totalValue = 0;

        // Loop through each product to calculate individual product values
        for (int i = 0; i < stockLevels.length; i++) {
            double productValue = stockLevels[i] * prices[i];  // Calculate value of each product
            totalValue += productValue;  // Add product value to total stock value

            // Print details of each product, including stock level, price, and total value
            System.out.println("Item " + (i + 1) + " - Stocks " + stockLevels[i] + " - Prices = PHP " + prices[i] + " - Total Value = PHP " + productValue);
        }

        // Initialize highest and lowest values with the first product value
        double highestValue = stockLevels[0] * prices[0];
        double lowestValue = stockLevels[0] * prices[0];

        // Loop through the products to find the highest and lowest stock values
        for (int i = 0; i < 10; i++) {
          double productValue = stockLevels[i] * prices[i];
            if (productValue > highestValue) {
                highestValue = productValue;  // Update highest value if current product value is greater
            }
            if (productValue < lowestValue) {
                lowestValue = productValue;  // Update lowest value if current product value is lower
            }
        }

        // Calculate the average value of all stock items
        double averageValue = totalValue / 10;

        // Display summary of total, average, highest, and lowest stock values
        System.out.println("\nTotal stock value: PHP " + totalValue);
        System.out.println("Average stock value: PHP " + averageValue);
        System.out.println("Highest stock value: PHP " + highestValue);
        System.out.println("Lowest stock value: PHP " + lowestValue);
    }
}