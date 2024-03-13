package basicsofjava;
//method overlaoding program
public class sixth 
{
	 void add()
	{
		System.out.println("Method 1");
	}
	static void add(char a,double b,String c)
	{
		System.out.println("Method 3");
	}
	static void add(int a)
	{
		System.out.println("Method 2");
	}
	public static void main(String[] args) 
	{
		sixth s1=new sixth();
		s1.add();
		add(100);
		add('A',7.65,"India");
		
	}

}
