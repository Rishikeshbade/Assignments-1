package Assignments1;

import java.util.Scanner;

public class MultiplyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System .in);
		
		System.out.println("Enter the first Number: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		double b = sc.nextDouble();
		
		 double result = a * b;
		 
		 System.out.println("The Multiplication of Two Numbers is: "+result);

	}

}
