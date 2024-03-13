package Loops;

public class LocalGlobalDemo

{
	
	String name1="India"; //non static global variable declaration & initialization
	
	static int m=100;
	
	char c;
	
	void method1()
	
	{
		c='J';
	    char gendar1= 'F';
	    char gendar2= 'M';
	    System.out.println(gendar1);
	}

	public static void main(String[] args)
	
	{
		
		int a=10;
		String name="Jaya";
		System.out.println(m);
		
		LocalGlobalDemo m1=new LocalGlobalDemo();
		m1.method1();
		
		System.out.println(m1.name1);
		System.out.println(m1.c);
		
		// TODO Auto-generated method stub

	}

}
