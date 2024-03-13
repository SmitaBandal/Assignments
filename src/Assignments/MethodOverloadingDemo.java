package Assignments;

public class MethodOverloadingDemo {

	
		void add()
		{
			System.out.println("Non static method 1");
		}
		void add(int a)
		{
			System.out.println("Non static method 2");
		}
		void add(int x, int y)
		{
			System.out.println("Non static method 3");
		}
		void add(char c)
		{
			System.out.println("Non static method 4");
		}
		static void add(int a,double b)
		{
			System.out.println("Static Method 1");
		}
		
		static void add(String S)
		{
			System.out.println("Static Method 2");
		}
		static void add(double a,int b)
		{
			System.out.println("Static Method 3");
		}
		static void add(boolean c)
		{
			System.out.println("Static Method 4");
		}
	public static void main(String[] args)

	{
		
		MethodOverloadingDemo mo=new MethodOverloadingDemo();//creating classname
		mo.add();
		mo.add(5);
		mo.add(10, 20);
		mo.add('F');
		add(20, 23.25);
		add("Smita");
		add(256.309, 100);
		add(true);
	}
	}

