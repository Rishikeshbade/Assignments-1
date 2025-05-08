package Assignments1;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

}
