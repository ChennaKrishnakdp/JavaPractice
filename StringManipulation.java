package ArraysPractice;

public class StringManipulation {

	public static void main(String[] args) 
	{
		String s = "Chaitanya Kumar Mudamala";
		String st = "";
		for(int i=0; i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(Array.toString(s);
			System.out.print(s.charAt(i));
			st = st + s.charAt(i);						
		}
		System.out.println(" ");
		System.out.println("Just another one");
		System.out.println(st);//.trim());
	}

}
