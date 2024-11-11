// Programmer: Marl Zandro T. Andaya
// Date: November 7, 2024
// Final Challenge No. 1: Retail Store Inventory Management (1D array)

public class Main {
    public static void main(String[] args) {
        // Arrays to hold the stock levels and prices for each product
        int stockLevels [] = {100, 32, 140, 29, 111, 36, 71, 112, 76, 67};
        double prices [] = {25.5, 20.5, 40.5, 55.5, 50.5, 72.5, 44.5, 60.5, 35.5, 15.5};

        // Variable to keep track of the total value of all items in stock
        double totalValue = 0;

        // Loop through each product to calculate individual product values
        for(int i = 0; i < stockLevels.length; i++) {
            // Calculate the total value for each product
            double productValue = stockLevels[i] * prices[i];
            totalValue += productValue;  // Add each product's value to the overall total value

            // Print each product's details, including stock level, price, and total value
            System.out.println("Item: " + (i + 1) + " - Stocks: " + stockLevels[i] + " - Prices: PHP " + prices[i] + " - Total Value:  PHP " + productValue);
        }

        // Print the total value of all products in stock
        System.out.println("\nTotal values of all the items in stock: PHP " + totalValue);
    }
}   