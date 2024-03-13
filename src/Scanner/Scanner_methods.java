package Scanner;

import java.util.Scanner; //import scanner class package

public class Scanner_methods 
{
	public static void main(String[] args) 
	//Scanner is predefined class to accept input
	
	{
		Scanner S1=new Scanner(System.in);
		
		 System.out.println("Enter any line");
	        String line=S1.nextLine();
		
		System.out.println("Enter the value of n3");
	
		int n3=S1.nextInt(); 
		
		System.out.println("Enter the value of b1");
		byte b1=S1.nextByte(); 
		
		
		System.out.println("Enter the value of sh");
		short sh=S1.nextShort();
		
		System.out.println("Enter the value of l");
        long l=S1.nextLong();
        
    	System.out.println("Enter the value of d");
        double d=S1.nextDouble();
        
    	System.out.println("Enter the value of f");
        float f=S1.nextFloat();
        
        System.out.println("Enter the name");
        String name=S1.next();
        
       
        
        System.out.println("Enter True or false b");
        boolean b=S1.nextBoolean();
        
        
	}

}


