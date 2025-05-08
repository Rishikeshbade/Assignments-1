package Assignments1;

import java.util.Scanner;

public class UserId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String expectedUserId = "jake123";
		
		System.out.println("Enter User ID: ");
		String input = sc.nextLine();
		
		if(input.equals(expectedUserId)) {
			System.out.println("User ID Matched!");
			System.out.println("Name: Jake");
			System.out.println("Age: 25");
		}else {
			System.out.println("User Id Not Matched");
		}

	}

}
