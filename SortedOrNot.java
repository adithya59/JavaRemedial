/************************************************************************************************************
 * File					:SortedOrNot.java
 * Description			:a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
 * @author Student		:Adithya P Binu
 * Version				:1.0
 *Date					:11/10/2023
 ***********************************************************************************************************/
import java.util.Scanner;
public class SortedOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1>num2 && num2>num3) {
			System.out.println("Descending order");
		}
		else if(num3>num2 && num2>num1) {
			System.out.println("Ascending order");
		}
		else {
			System.out.println("Neither Ascending nor Descending");
		}
	}
}
