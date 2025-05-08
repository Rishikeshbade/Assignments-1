package Assignments1;

import java.util.Scanner;

public class AgeIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		int age = sc.nextInt();
		
		 int IncementAge = age + 1;
		 
		 System.out.println("Your Age will be: "+IncementAge);

	}

}
