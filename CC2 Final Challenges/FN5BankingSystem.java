// Programmer: Marl Zandro T. Andaya
// Date: December 1st week 2024
// Final Challenge No. 5: Exception Handling Laboratory Challenges Banking System
import javax.swing.JOptionPane;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class FN5BankingSystem{
    private double balance; // User's current balance
    
    public FN5BankingSystem(double initialBalance) {
        this.balance = initialBalance;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        // Check if the withdrawal amount is less than or equal to zero
        if (amount <= 0) {
            throw new InsufficientFundsException("Withdrawal amount must be greater than zero.");
        }
        // Check if the withdrawal amount exceeds the current balance
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Your balance is only PHP " + balance + ".");
        }
        // Deduct the amount from the balance
        balance -= amount;
        // Display success message
        JOptionPane.showMessageDialog(null, "Withdrawal successful! Remaining balance: PHP " + balance, 
                                      "Transaction Successful", JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * Displays the current account balance to the user.
     */
    public void displayBalance() {
        JOptionPane.showMessageDialog(null, "Current balance: PHP " + balance, 
                                      "Account Balance", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        // Initialize the user's account with a starting balance
        FN5BankingSystem account = new FN5BankingSystem(5000.00);
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Banking System!", 
                                      "Welcome", JOptionPane.INFORMATION_MESSAGE);
        // Display the initial account balance
        account.displayBalance();
        try {
            // Prompt the user to enter an amount to withdraw
            String input = JOptionPane.showInputDialog(null, "Enter amount to withdraw:", 
                                                       "Withdrawal", JOptionPane.QUESTION_MESSAGE);
            // Check if the user canceled the operation
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Transaction cancelled.", 
                                              "Cancelled", JOptionPane.INFORMATION_MESSAGE);
                return; // Exit the program
            }
            // Parse the input to a double value
            double amount = Double.parseDouble(input);
            // Attempt the withdrawal
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            // Handle insufficient funds exception and display the error message
            JOptionPane.showMessageDialog(null, e.getMessage(), 
                                          "Error: Insufficient Funds", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            // Handle invalid input (non-numeric) and display an error message
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value.", 
                                          "Input Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Display a goodbye message regardless of the outcome
            JOptionPane.showMessageDialog(null, "Thank you for using the Banking System.", 
                                          "Goodbye", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
