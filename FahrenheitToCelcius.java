package Assignments1;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Fahrenheit: ");
		
		double fahrenheit = sc.nextDouble();
		
		double celcius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("Temperature in Celcius: "+celcius);

	}

}
