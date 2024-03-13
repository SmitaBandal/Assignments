package Inheritance;

class Supermostparent
{
	void add()
	{
		System.out.println("add");
	}
	
	void sub()
	{
		System.out.println("sub");
	}
}

class Superparent extends Supermostparent

{
	void multi()
	{
		System.out.println("multi");
	}
	
	void Div()
	{
		System.out.println("Div");
	}
}


public class Multi extends Superparent

{
	void mod()
	{
		System.out.println("mod");
	}



	public static void main(String[] args) 
	
	{
		Multi m1=new Multi();
		m1.add();
		m1.sub();
		m1.multi();
		m1.Div();
		m1.mod();

	}

}
