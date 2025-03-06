package BasicsPractice;

public class LargetNumber 
{
	public static void main(String[] args)
	{
		int num1 = 80;
		int num2 = 70;
		int num3 = 100;	
		
		int res = num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
		
		System.out.println("Largest number is: "+res);
		
				
		
	}

}
