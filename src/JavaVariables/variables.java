package JavaVariables;

public class variables {
	
int m=100; //instance/global/class variable
	
	public void Addition()
	{
		int a= 10; // local variables
		int b= 20;
		int c= a+b;
		m=c+10;		//instance or global variable
		System.out.println("Addition of a and b is" +c);
		System.out.println("m is " +m);
	}
	
	public void Difference()
	{
		int x= 100;  // local variables
		int y= 50;
		int z= x-y;
		m=z-20;		//instance or global variables.
		System.out.println("Difference of x and y is" +z);
		System.out.println("m is " +m);
		
	}
	
	public static void main(String[] args) {
		
		variables var = new variables();
		var.Addition();// Access through object.
		var.Difference();
		System.out.println(var.m);
		
		
	}
	
	
	
	

}



