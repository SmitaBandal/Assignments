package basicsofjava;

public class ConstructorDemo 

{

	ConstructorDemo() // constrtuctor
	
	{
	System.out.println("This is consructor");
	}
	
	void Name() // non static method
	{
		String Name="Smita Bandal";
		System.out.println(Name);
	}
	
	  static void multiply() // static method
	  {
		  int a=20, b=15;
		  System.out.println("Multiplication of a and b ="+(a*b));
	  }

	public static void main(String[] args)
	
	{
		System.out.println("this is main method");
		ConstructorDemo s1=new ConstructorDemo();//calling constuctor
		add(); //calling static method
		s1.subtract(); //calling non static method
		s1.Name();
		multiply();
		//new ConstructorDemo(); //another way of calling constructor	
		

	}
	  static void add()
	  {
		  int a=20, b=15;
		  System.out.println("Addition of a and b ="+(a+b));
	  }
	  
	   void subtract()
	  {
		  int a=20, b=15;
		  System.out.println("subtraction of a and b ="+(a-b));
	  }
	  

	

}
