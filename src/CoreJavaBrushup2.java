public class CoreJavaBrushup2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int[] numbers = {11,22,23,21,20,25,24,28,30};
		
		for(int a = 0; a < numbers.length; a++)
		{
			if(numbers[a]%2==0)
			{
				System.out.println("Ev:"+numbers[a]);
			}
			else
			{
				System.out.println("Od:"+numbers[a]);
			}
		}
		
		//------------------------------------------------------------
		
		
		int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < arr3.length; i++)
		{
			System.out.println(arr3[i]);
		}
		
		//Print even
		for(int j = 0; j < arr3.length; j++)
		{
			if(arr3[j] % 2 == 0)
			{
				System.out.println("Even :"+arr3[j]);
			}
			else
			{
				System.out.println("Odd :"+arr3[j]);
			}
		}	
	}
}
