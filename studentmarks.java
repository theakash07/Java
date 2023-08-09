
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("Maths: ");
		byte maths= sc.nextByte();
		System.out.println("English: ");
		byte english=sc.nextByte();
		System.out.println("HIndi ");
		byte hindi=sc.nextByte();
		int total =maths+english+hindi;
		float avg= (float)total/3;
		System.out.println("The total marks is " + total);
		System.out.println("The avg is : "+ avg);
		
		
		
	}
	
}
