
//below code is not working need to work on this.
package BasicsPractice;

public class PrimeNumberCheck {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		//System.out.println();
		
		for(int i=1;i<=a.length;i++)
		{
			if(a[i]%1 == 0 && a[i]%a[i] == 0)
			{
				System.out.println(a[i] +" is Prime number");
			}
			else
			{
				System.out.println(a[i] +" is Not Prime number");				
			}
		}

	}

}
