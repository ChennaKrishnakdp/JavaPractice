package BasicsPractice;

//import java.io.*;
import java.util.*;

public class UserInput 
{
	public static void main(String[] args)
	{
		int num;
		int num1;
		System.out.println("Enter new nember: ");
		Scanner sc = new Scanner(System.in);
				num = sc.nextInt();
							
		System.out.println("Enter another number: ");		
				num1 = sc.nextInt();		
		
		int res = num + num1;
		System.out.println("Sum of given numbers is: " +res);
		sc.close();						
	}
}