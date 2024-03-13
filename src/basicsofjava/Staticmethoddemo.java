	package basicsofjava;

public class Staticmethoddemo 

{
	static void add()
	{
		System.out.println("Addition Method");
	}

	public static void main(String[] args)
	{
		System.out.println("calling ststic method inside main method");
		add();
	}

}
