package Assignments1;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle: ");
		double r = sc.nextDouble();
		
		double area = pi * r * r;
		
		double circumstance = 2 * pi * r;
		
		System.out.println("Area of Circle is: "+area);
		
		System.out.println("Circumstance of Circle is: "+circumstance);

	}

}
