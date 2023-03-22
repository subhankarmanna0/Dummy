import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		//Create Obkect of the class - object.method
		a.add("Bappa");
		a.add("Tara");
		a.add("Baba");
		a.add("Dipu");
		
		System.out.println("3rd values:"+a.get(2));
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println(a.get(i));
		}

	}

}
