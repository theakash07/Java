// Online Java Compiler
// Use this editor to write, compile, and run your Java code online

import java.util.Scanner; // Importing the Scanner class to read user input

public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Taking input form the user");
        // The above line is commented out, so this message will not be displayed.
        
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input from the user
        
        System.out.println("Enter number 1:"); // Prompting the user to enter number 1
        
        int a = sc.nextInt(); // Reading an integer input from the user and storing it in variable 'a'
        
        System.out.println("Enter number 2:"); // Prompting the user to enter number 2
        
        int b = sc.nextInt(); // Reading another integer input from the user and storing it in variable 'b'
        
        int sum = a + b; // Calculating the sum of 'a' and 'b' and storing it in the 'sum' variable
        
        System.out.println("The sum of a and b " + sum); // Displaying the sum on the console along with a message
    }
}
