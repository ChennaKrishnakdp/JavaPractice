package BasicsPractice;

public class SummOfArray {

	public static void main(String[] args) 
	{
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int finalRes = 0;
		for(int i =0; i<a.length;i++)
		{
			 finalRes+= a[i];
			 //finalRes = finalRes + a[i];
			 //System.out.println(finalRes);
		}
		System.out.println(finalRes);
	}
}
