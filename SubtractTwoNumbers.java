package Assignments1;

import java.util.Scanner;

public class SubtractTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		int difference = a - b;
		
		System.out.println("The Difference of Two Numbers: "+difference);

	}

}
