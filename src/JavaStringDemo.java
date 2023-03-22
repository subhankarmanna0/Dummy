
public class JavaStringDemo {

	public static void main(String[] args) {
		
		String Email = "My Email is suhankar@gmail.com and or bhi hai";
		
		String[] splitEmail = Email.split("is");
		System.out.println(splitEmail[1].trim());
		
	String[] secSplitEmail = splitEmail[1].split(" ");
	System.out.println("last:"+secSplitEmail[1].trim());
		
		
		//------------------------------------------------------
		
		
		
		// TODO Auto-generated method stub
		//What String - String is a Object that represent sequence of char
		//Declare String 
		//Process One | String litral
		String s = "Subhankar Manna Dipu";
		//Process 2
		//String s1 = "Subhankar Manna";
		//Process 3 | using new memory operator
		String s2 = new String("Bappa");
		
		String[] splittedstring = s.split("Manna");
		
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());
		//Normal Print
	for(int i = 0; i < s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
	
	//Back
	for(int k = s.length()-1; k >= s.length(); k--)
	{
		System.out.println("Back: "+s.charAt(k));
	}
		
	}

}
