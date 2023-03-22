
public class CoreJavaBrushUp1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int myNum = 5; 
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum +"is stored in myNum variable");
		System.out.println("My Site name is-"+website);
		System.out.println(myNum+dec);
		
		//Array - Storing multiple value in a single variable
		//[] means array, new is operator it create a memeory how many value will store
		//Declare array - Process 1
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5; 
		//Process 2
		int[] arr2 = {1,2,3,4,5,6,7,8};
		System.out.println("My 3rd position arra value is: "+arr2[3]);
		
		int[] arrs = new int[4];
		arrs[0] = 10;
		arrs[1] = 11;
		arrs[2] = 12;
		arrs[3] = 13;
		
		for(int i = 0; i < arrs.length; i++)
		{
			System.out.println("New one:" +arrs[i]);
		}
		
		//for loop 
		for(int i = 0; i < arr.length ; i++)
		{
			System.out.println("First Array: "+arr[i]);
		}
		
		System.out.println("Length of array: "+arr2.length);
		for(int j = 0;j < arr2.length; j++)	
		{
			System.out.println("Second Array"+arr2[j]);
		}	
		
		String[] name = {"B", "A", "P", "P", "A"};
		for(int k = 0; k < name.length; k++)
		{
			System.out.println(name[k]);
		}
		
		for( String s: name)
		{
			System.out.println("Short mai: "+s);
		}
		
		String[] address = {"N", "A", "S", "K"};
		
		for(int x = 0; x<=address.length; x++)
		{
			System.out.println("address"+address[x]);
		}
		
	}
}
