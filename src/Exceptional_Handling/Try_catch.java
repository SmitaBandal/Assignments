package Exceptional_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
try {	
	int number=		s1.nextInt();
}
catch(InputMismatchException a1)
{
	System.out.println("Hey exception came but dont worry I handled it");
}
	finally
	{
		System.out.println("I am alwsye there");
	}
	
}
}
