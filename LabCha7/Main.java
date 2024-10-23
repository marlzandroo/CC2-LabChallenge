// Programmer: Marl Zandro T. Andaya
// Date: October 2nt week 2024
// Laboratory Challenge No. 7: Password Validation System


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your password: ");
            String password = scan.nextLine();

            if(password.length() >= 8 && password.matches(".*d.*") && password.matches(".*[A-Z].*")){
                System.out.println("Your password is valid");
                break;
            }
            else{
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }
    }
}
