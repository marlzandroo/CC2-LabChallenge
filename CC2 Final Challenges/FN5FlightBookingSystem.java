// Programmer: Marl Zandro T. Andaya
// Date: December 1st week 2024
// Final Challenge No. 5: Exception Handling Laboratory Challenges Flight Booking System

import javax.swing.JOptionPane;

// Define custom exception for no available seats
class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String message) {
        super(message);
    }
}
public class FN5FlightBookingSystem {
    public static void main(String[] args) {
        // Flight details
        String flightName = "Flight 101";
        int totalSeats = 10; // Total seats available
        int bookedSeats = 0; // Seats that have been booked
        
        while (true) {
            try {
                // Ask the user how many seats they want to book
                String inputSeats = JOptionPane.showInputDialog(null, 
                        "Enter the number of seats you want to book for " + flightName + 
                        "\nAvailable seats: " + (totalSeats - bookedSeats), 
                        "Flight Booking", JOptionPane.QUESTION_MESSAGE);
                // If the user cancels the input, exit the loop
                if (inputSeats == null) {
                    JOptionPane.showMessageDialog(null, "Operation cancelled.", 
                                                  "Info", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                int requestedSeats = Integer.parseInt(inputSeats);
                
                // Validate seat booking
                if (requestedSeats <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a positive number of seats.", 
                                                  "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                // Check if there are enough available seats
                if (bookedSeats + requestedSeats > totalSeats) {
                    throw new NoSeatsAvailableException("No seats are available for " + flightName + ". Try booking fewer seats.");
                }
                // Update booked seats
                bookedSeats += requestedSeats;
                JOptionPane.showMessageDialog(null, "You have successfully booked " + requestedSeats + " seat(s) for " + flightName + ".\n" +
                                                  "Remaining seats: " + (totalSeats - bookedSeats), 
                                              "Booking Success", JOptionPane.INFORMATION_MESSAGE);
                // Ask if the user wants to book again
                int response = JOptionPane.showConfirmDialog(null, "Would you like to book more seats?", 
                                                             "Book More?", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.NO_OPTION) {
                    break;  // Exit the loop if the user doesn't want to book more seats
                }

            } catch (NoSeatsAvailableException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", 
                                              "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
