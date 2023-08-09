import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner input =new Scanner(System.in);
        int count[] = new int[10];
        // Initialize the array elements, if needed
        for (int i = 0; i < count.length; i++) 
        {
             count[i]=input.nextInt();
        }
        
        for (int i = 0; i < count.length; i++) {  // Outer loop from 0 to 9 (inclusive)
            for (int j = 0; j < count.length; j++) {  // Inner loop from 0 to 9 (inclusive)
                System.out.print(j);  // Printing a single asterisk
            }
            System.out.println();  // Printing a newline after the inner loop completes
        }
    }
}
