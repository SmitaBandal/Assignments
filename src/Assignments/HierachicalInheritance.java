package Assignments;

class H_Parent //parent class
{
	void surname()
	{
		System.out.println("Surname");
	}
}

class Child1 extends H_Parent //child 1 inheriting Parent class
{
	void name1()
	{
		System.out.println("child 1 name");
	}
}

class Child2 extends H_Parent //child 2 inheriting Parent class
{
	void name2()
	{
		System.out.println("child 2 name");
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.name1();
		c1.surname();
		
		Child2 c2=new Child2();
		c2.name2();
		c2.surname();
		
	}

}
