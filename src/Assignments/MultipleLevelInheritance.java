package Assignments;

interface EmployeeName
{
	void name();
	void surname();
}

interface Salary
{
	void sal();
}

interface Department
{
	void dept();
}

interface Contact
{
	void mobile();
	void email();
}

public class MultipleLevelInheritance implements EmployeeName,Salary,Department,Contact
{

	public static void main(String[] args) {
		
		MultipleLevelInheritance m1=new MultipleLevelInheritance();
		m1.name();
		m1.surname();
		m1.sal();
		m1.dept();
		m1.mobile();
		m1.email();

	}

	public void name() {
		System.out.println("Smita");
		
	}

	public void surname() {
		System.out.println("Bandal");
		
	}

	public void sal() {
		System.out.println("Salary 10000");
		
	}

	public void dept() {
		System.out.println("Software testing");
		
	}

	public void mobile() {
		System.out.println("8208023297");
		
	}

	public void email() {
		System.out.println("smitail@gmail.com");
		
	}

}
