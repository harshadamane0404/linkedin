package sample;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int no;
	System.out.println("Enter the number -" );

	no=sc.nextInt();
	//System.out.println(no);
	
	if(no/2==1)
	{
	System.out.println("Eumber is odd");
	}
	else
	{
		System.out.println("Number is even");
	}
	}
}
