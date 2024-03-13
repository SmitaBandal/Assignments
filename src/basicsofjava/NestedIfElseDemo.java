package basicsofjava;

public class NestedIfElseDemo {

	public static void main(String[] args) 
	{
		int age=20;
		char gendar='M';
		char gendar1='F';
		
		if(gendar=='M')
		{
			if(age>18)
			{
				System.out.println("Eligible for vote");
			}
		}
		else
		{
			System.out.println("Not eligible");
		}

		if(gendar1=='F')
		{
			if(age>18)
			{
				System.out.println("Eligible for vote");
			}
		}
		else
		{
			System.out.println("Not eligible");
		}

	}

}
