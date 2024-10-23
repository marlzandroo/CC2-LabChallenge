// Programmer: Marl Zandro T. Andaya
// Date: October 1st week 2024
// Laboratory Challenge No. 6: Classroom Attendance System

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input the total number of students in the class
        System.out.print("Enter the total number of students: ");
        int totalStudents = scan.nextInt();

        int presentStudent = 0;
        int absentStudent = 0;

        // Loop through each student to ask for their attendance
        for (int i = 1; i <= totalStudents; i++) {
            while (true) { // Repeat until a valid input is received
                System.out.print("Is student " + i + " present? (Y/N): ");
                char response = scan.next().charAt(0);

                // Check if the response is 'Y' for present, 'N' for absent
                if (response == 'Y') {
                    presentStudent++;
                    break; // Valid input received, exit the loop
                } 
                else if (response == 'N') {
                    absentStudent++;
                    break; // Valid input received, exit the loop
                } 
                else {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                }
            }
        }

        // Display the final counts of present and absent students
        System.out.println("Total Present: " + presentStudent);
        System.out.println("Total Absent: " + absentStudent);
        
        scan.close();
    }
}
