// Programmer: Marl Zandro T. Andaya
// Date: November 23, 2024
// Final Challenge No. 3: University Course Enrollment and Grades Tracker (1D and 2D arrays)

public class FinalNum3 {
    public static void main(String[] args) {
        // Array to store student names
        // These are the names of the 5 students.
        String[] studentNames = {"Marl", "Zanny", "Zann", "Mazz", "Zandro"};
        
        // 2D array to store grades of 5 students in 3 subjects
        // Each row contains the grades for one student across three subjects.
        double[][] grades = {
            {89, 90, 88},  // Grades for Marl
            {75, 80, 82},  // Grades for Zandro
            {95, 89, 92},  // Grades for Zann
            {83, 88, 81},  // Grades for Mazz
            {90, 92, 91}   // Grades for Zanny
        };
        
        // Array to store average grades for each student
        double[] averageGrades = new double[5];
        
        // Calculate the average grade for each student
        for (int i = 0; i < 5; i++) { // Loop through each student
            double totalGrade = 0; // Variable to hold the total grades
            for (int j = 0; j < 3; j++) { // Loop through each subject
                totalGrade += grades[i][j]; // Add the grade to the total
            }
            // Calculate the average by dividing the total by 3 (number of subjects)
            averageGrades[i] = totalGrade / 3;
        }
        
        // Display the results
        System.out.println("Student Grades Summary:");
        for (int i = 0; i < 5; i++) { // Loop through each student
            // Print the student's name
            System.out.println("Student " + (i + 1) + ": " + studentNames[i]);
            // Print their average grade
            System.out.println("Average Grade: " + averageGrades[i]);
            // Add a blank line for readability
            System.out.println(" ");
        }
    }
}