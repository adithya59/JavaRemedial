/***********************************************************************************************
 * Name				:LeapYear.java
 * Description			:Java program that takes a year from the user and prints whether it is a leap year or not. 
 * Author			:Adithya P Binu
 * Version			:1.0
 * Date				:27/09/2023
 * *********************************************************************************************/
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an year:");
		year = sc.nextInt();
		if (year%4==0) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year.");
		}
	}
}
