package Inheritance;

class parent 
{
	void add()
	{
		int a=10;
		int b=15;
		System.out.println(a+b);
	}
}

class child extends parent
{
	void add() // method in child class with same name but different implementation
	{
		System.out.println("Method Overriding demo");
	}
}

public class MethodOveriding 
{

	public static void main(String[] args) 
	{
		child c1=new child(); 
				c1.add(); // child class method will be displayed and parent class method will be overridden

	}

}
