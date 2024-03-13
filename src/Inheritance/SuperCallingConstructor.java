package Inheritance;

class G_parent
{
	G_parent(int a,int b)
	{
		System.out.println("Grnd parent constructor");
	}
}

class newParent extends G_parent
{
	newParent (String Name)
	{
		
		super(10,20); //super calling G_parent class constructor in parent class expliciltly 
		System.out.println("Parent construcor");
		
	}
}
public class SuperCallingConstructor  extends newParent

{
	SuperCallingConstructor()
	{
		super("smita"); //super calling parent class constructor in child class expliciltly 
		System.out.println("main or child class constructor");
	}

	public static void main(String[] args) 
	{
		new SuperCallingConstructor();

	}

}

