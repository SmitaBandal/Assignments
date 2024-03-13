package basicsofjava;

public class NestedIfElseDemoClass {

	public static void main(String[] args) 
	
	{
		char gendar='M';
		char gendar2='F';
		int age=20;
		
		if (gendar=='M')
		{
			if (age>18)
			{
				System.out.println("Male is eligible for vote");
			}
			else	
			{
				System.out.println("Person male is minor");
			}
		}
		
		else
		{
			System.out.println("Not eligible");
		}
		
		if (gendar2=='F')
		{
			if (age>18)
			{
				System.out.println("FeMale is eligible for vote");
			}
			else	
			{
				System.out.println("Person FeMale is minor");
			}
		}
		
		else
		{
			System.out.println("Not eligible for vote");
		}
		
	}

}
