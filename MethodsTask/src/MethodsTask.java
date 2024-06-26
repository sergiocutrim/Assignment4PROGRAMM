// First thing is to import the scanner
import java.util.Scanner;
// Declaring public class and main
public class MethodsTask {
    public static void main(String[] args) {
        // Open scanner
        Scanner scanner = new Scanner(System.in);
        // Ask the user to input their first name
        System.out.print("Please enter your first name: ");
        // Store the users input into a new variable named userName
        String userName = scanner.next();
        //Ask the user to input their last name
        System.out.print("Please enter your last name: ");
        // Store the users input into a new variable named userLastName
        String userLastName = scanner.next();
        // Ask the user to input their grade in the 1st test 
        System.out.print("Please enter your 1st test grade (between 0 and 100): ");
        // Store the users input into a new variable named userName
        double userTest1 = scanner.nextDouble();
        // Ask the user to input their grade in the 2nd test 
        System.out.print("Please enter your 2nd test grade (between 0 and 100): ");
        // Store the users input into a new variable named userName
        double userTest2 = scanner.nextDouble();
        // Ask the user to inform the number to calculate the factorial
        System.out.print("Please enter a number to calculate times table and factorial: ");
        // Store the number for the factorial calculation
        int number = scanner.nextInt();
        // Ask the user the base to calculate the exponent
        System.out.print("Please enter the base to calculate exponent: ");
        // Store the base in a new double variable
        double base = scanner.nextDouble();
        // Ask the user for an exponent
        System.out.print("Enter the exponent: ");
        // Store the exponent as a new integer
        int exponent = scanner.nextInt();
        // Call Method#1: printFullName with provided first and last name
        printFullName(userName, userLastName);
        // Call Method#2: getGrade with the two test results and prints the result
        System.out.println("Based on the marks of your first exam " + userTest1 + " and your second exam " + userTest2 + " your grade is " + getGrade(userTest1, userTest2));
        // Call Method#3: printTimesTable of number user will input
        printTimesTable(number);
        // Call Method#4: getFactorial, calculate the factorial of a number user will input
        System.out.println("The factorial of " + number + " is: " + getFactorial(number));
        // Call Method#5: exponent
        System.out.println(base + " raised to the power of " + exponent + " is: " + calculatePower(base, exponent));
        // Closing the scanner
        scanner.close();
    }
    // Method#1: printFullName
    public static void printFullName(String firstName, String lastName) {
        // Concatenate the first name and last name and print them
        System.out.println("Full Name: " + firstName + " " + lastName);
    } 
    // Method#2: getGrade
    public static String getGrade(double userTest1,double userTest2) {
        // Calculate the average between 2 grades
        double avg = (userTest1+userTest2)/2;
        String grade;
        // Defines the final grade based on the table provided
        if (avg>=90.0){
            grade="A+";
        } else if (avg>=80.0){
            grade="A";
        } else if (avg>=70.0){
            grade="B+";
        } else if (avg>=60.0){
            grade="B";
        } else if (avg>=50.0){
            grade="D";
        } else {
            grade="F";
        }
        return grade;
    }
    // Method #3: printTimesTable
    public static void printTimesTable (int number) {
        
        // Check if the user input is between 1 and 10
        if (number >= 1 && number <= 10) {
            // If the input is valid, find the timetable and print it
            System.out.println("Times Table for " + number + ":");
            for (int i = 1; i <= 10; i++) { // In this case the FOR will run 10 times, adding the integer until it is equal to 10.
                System.out.println(number + " x " + i + " = " + (number * i));
            }}
            else {
              System.out.println("Invalid input. Number should be between 1 and 10."); // If the number is wrong
            }
    }
    // Method#4: getFactorial
    public static int getFactorial(int numberFactorial) {
        // Declare new int to store the multiplication
        int factorial=1;
        // Open a FOR to multiply the factorial by i
        for (int i = 1; i <= numberFactorial; i++) {
            // Keep multiplying until i is minor or equal to numberFactorial
            factorial *= i;
        }
        // Return the result of the factorial
        return factorial;
    }
    // Method#5: calculatePower
    public static double calculatePower (double base, int exponent) {
        // Declare new double to store the result
        double result = 1.0;
        // Open FOR to keep multiplying as many times aa the exponent
        for (int i = 0; i < exponent;i++){
            // Keep multiplying the base by itself until reach exponent value
            result *=base;
        }
        // Return the result
        return result;
    }       
}
   

