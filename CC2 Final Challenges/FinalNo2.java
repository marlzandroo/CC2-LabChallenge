// Programmer: Marl Zandro T. Andaya
// Date: November 7, 2024
// Final Challenge No. 2: Weather Data Tracker (2D array)

public class FinalNo2 {
    public static void main(String[] args) {
        // Step 1: Create a 2D array to store temperatures for 3 cities over 7 days
        // Each row represents a city, and each column represents a day
        double[][] temperatures = {
            {27.5, 24.5, 31.5, 30.5, 27.5, 28.5, 29.5}, // City 1
            {24.5, 29.3, 27.8, 27.0, 27.9, 28.5, 27.5}, // City 2
            {22.5, 23.1, 22.8, 24.5, 24.0, 23.7, 23.9}  // City 3
        };
        
        // Step 2: Process each city's data to calculate and display the average
        // and the highest temperature for the week
        for (int city = 0; city < temperatures.length; city++) {
            double sum = 0; // Variable to store the total temperature for the week
            double highestTemp = temperatures[city][0]; // Variable to track the highest temperature

            // Loop through each day's temperature for the current city
            for (int day = 0; day < temperatures[city].length; day++) {
                sum += temperatures[city][day]; // Add the temperature to the total
                if (temperatures[city][day] > highestTemp) {
                    highestTemp = temperatures[city][day]; // Update highest temperature if a higher value is found
                }
            }
            
            // Calculate the average temperature for the week
            double averageTemp = sum / temperatures[city].length;    
            
            // Display the city's average and highest temperature
            System.out.println("City " + (city + 1) + ":");
            System.out.println("  Average Temperature: " + averageTemp + "°C");
            System.out.println("  Highest Temperature: " + highestTemp + "°C");
            System.out.println(); // Add a blank line for better readability
        }
    }
}
