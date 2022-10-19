/*
Program: To check number is even or odd
@author: karan singh
@Date: 18 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class EvenOddDemo
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter number:");
		// creating variables
		int num= sc.nextInt();

		if((num%2)==0)
			System.out.println("The number "+num+" is even");
		else
		   System.out.println("The number "+num+" is odd");




	}


	// end of main
}
// end of class 

 37  
18oct/IfElseDemo.java
@@ -0,0 +1,37 @@
