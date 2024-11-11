// Programmer: Marl Zandro T. Andaya
// Date: November 7, 2024
// Final Challenge No. 2: Weather Data Tracker (2D array)

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a 2D array to store temperatures for 3 cities over 7 days
        double[][] temperatures = {
            {27.5, 24.5, 31.5, 30.5, 27.5, 28.5, 29.5}, // City 1
            {24.5, 29.3, 27.8, 27.0, 27.9, 28.5, 27.5}, // City 2
            {22.5, 23.1, 22.8, 24.5, 24.0, 23.7, 23.9}  // City 3
        };
        
        // Step 2: Calculate and display average and highest temperature for each city
        for (int city = 0; city < temperatures.length; city++) {
            double sum = 0;
            double highestTemp = temperatures[city][0];

            // Calculate the sum and find the highest temperature
            for (int day = 0; day < temperatures[city].length; day++) {
                sum += temperatures[city][day];
                if (temperatures[city][day] > highestTemp) {
                    highestTemp = temperatures[city][day];
                }
            }
            
            double averageTemp = sum / temperatures[city].length;
            
            // Print the results in the specified format
            System.out.println("City " + (city + 1));
            System.out.println("Average Temperature: " + averageTemp + "°C");
            System.out.println("Highest Temperature: " + highestTemp + "°C");
            System.out.println();
        }
    }
}