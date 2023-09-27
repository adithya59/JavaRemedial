/***********************************************************************************************
 * Name				:PositiveOrNegative.java
 * Description		:Java program to get a number from the user and print whether it is positive or negative 
 * Author			:Adithya P Binu
 * Version			:1.0
 * Date				:27/09/2023
 * *********************************************************************************************/

import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = sc.nextInt();
		if (number>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
	}
}
