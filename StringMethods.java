package ArraysPractice;

public class StringMethods {

	public static void main(String[] args) {
		String temp = "";
		String s = "Hi Everyone Welcome to Automation Testing. ";
		String s2 = "This is our first class. ";
		String s4 = "Java Strings Practice";
		String s5 = new String("Java Strings Practice");
		int stu = 100;
		
		System.out.println(s.compareTo(s2));
		System.out.println(s.length());
		System.out.println(s2.length());
		
		String st = String.valueOf(stu); // converts other data types to String
		System.out.println("string "+st);
		
		int ln = s.length(); // finding the length of the given string
		System.out.println(ln);
		
		String s3 = s.concat(s2); //Concatenation the given two strings
		System.out.println(s3);
		
		String sub = s.substring(3,11); //getting substring of the given string
		System.out.println(sub);
		
		String lo = s.toLowerCase(); //Converting into the lower case
		String upp = s.toUpperCase(); //Converting into the upper case		 
		
		System.out.println(lo);
		System.out.println(upp);
		
		System.out.println(s.trim()); //removing the extra space from the string		
		System.out.println("Comparing the Object Value: " +(s4.equals(s5))); // Comparing the object value		
		System.out.println("Comparing the Object Reference: " +(s4 == s5)); // comparing the object reference.
		System.out.println(s.concat(s2.concat(s4)));
		
		String arr[] = s.split(" "); // Split the given	string	
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		for (int i = s.length()-1;i>=0;i--) // Reverse the string
		{
			 temp = temp+s.charAt(i);			
		}
		System.out.println(temp.trim());
	}
}
