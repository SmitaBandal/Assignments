package basicsofjava;

public class staticmethodsdemo {
	
	
	static void add()
	{
		int a=100, b=20;
		int sum=a+b;
		System.out.println("Addition of a & b = "+sum);
		
	}
	
	static void subtract()
	{
		int a=100, b=20;
		int sub=a-b;
		System.out.println("Subtraction of a & b = "+sub);
		
	}
	
	static void multi()
	{
		int a=10, b=20;
		int mul=a*b;
		System.out.println("Multiplication of a & b = "+mul);
		
	}
	

	public static void main(String[] args) 
	{
		add();
		subtract();
		multi();
		division();
		modulos();
	}
	static void division()
	{
		int a=100, b=20;
		int div=a/b;
		System.out.println("division of a & b = "+div);
		
	}
	
	static void modulos()
	{
		int a=130, b=20;
		int mod=a%b;
		System.out.println("modulos of a & b = "+mod);
		
	}
	

}
