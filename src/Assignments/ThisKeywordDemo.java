package Assignments;

public class ThisKeywordDemo {
	
	int rollnum; //global variables
	String studname;
	double marks;
	
	void display(int rollnum, String studname, double marks)
	{
		this.rollnum=rollnum; //assign local variable value to global variable
		this.studname=studname;
		this.marks=marks;
	}

	public static void main(String[] args) {
		
		
		ThisKeywordDemo t1=new ThisKeywordDemo();
		
		t1.display(7, "Ananaya", 95); //passing local variable values
		
		System.out.println(t1.rollnum);
		System.out.println(t1.studname);
		System.out.println(t1.marks);

	}

}
