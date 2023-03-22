
public class Duplicate 
{

	public static void main(String[] args) 
	{
		
		String[] myName = {"K", "O", "L", "K", "A", "T", "A"};
		
		for(int a = 0; a < myName.length; a++)
		{
			for(int b = a+1; b < myName.length; b++)
			{
				if(myName[a] == myName[b])
				{
					System.out.println("New Duplicate"+myName[b]);
				}
			}
		}
		
//-------------------------------------------------------------
		
		
		
		// TODO Auto-generated method stub
		String[] name = {"B", "A", "P", "P", "A"};
		
		for(int i = 0; i < name.length; i++)
		{
			System.out.println("i Value: "+ name[i]);
			for (int k = i+1; k < name.length; k++)
				
			{
				if(name[i] == name[k])
				{
					System.out.println("K value:" +name[k]);
					System.out.println("Duplicate: "+name[k]);
				}
			}
		}
		
		

	}

}
