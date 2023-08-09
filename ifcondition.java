
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		byte age = sc.nextByte();
		if (age >20)
		{
		    System.out.println("You can go on date: ");
		}
		else{
		    System.out.println("You arenot eligible for date :");
		}
		
		
	}
	
}
