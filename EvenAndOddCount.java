package BasicsPractice;

public class EvenAndOddCount {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
		//int res = 0;
		int evencount = 0;
		int count =0;
		
		for(int i =0; i<a.length;i++)
		{
			if (a[i]%2 == 0)
			{
				evencount++;				
			}				
		}
		System.out.println("Even numbers count " + evencount);
		for(int i =0; i<a.length;i++)
		{
			if (a[i]%2 != 0)
			{
				count++;				
			}				
		}
		System.out.println("odd numbers count " + count);	

	}

}
