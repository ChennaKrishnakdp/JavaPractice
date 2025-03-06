package ArraysPractice;

public class SearchElement {

	public static void main(String[] args) {
		int a[] = {10,2,2,3,4,10,15,10,20,10,30,100,10};
		int searchElement = 15;
		int count = 0;
		int l = a.length;
		System.out.println(l);
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i] == searchElement)
			{
				count++;
			}			
		}
		System.out.println(searchElement +" repeated "+ count +" times");
	}

}
