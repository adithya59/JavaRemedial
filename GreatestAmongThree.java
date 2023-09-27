/***********************************************************************************************
 * Name				:PositiveOrNegative.java
 * Description		:Java program to get a number from the user and print whether it is positive or negative 
 * Author			:Adithya P Binu
 * Version			:1.0
 * Date				:27/09/2023
 * *********************************************************************************************/
import java.util.Scanner;
public class GreatestAmongThree {
	public static void main(String[] args) {
		int Number1,Number2,Number3;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter three numbers:");
		Number1 = sc.nextInt();
		Number2 = sc.nextInt();
		Number3 = sc.nextInt();
		if (Number1>Number2 & Number1>Number3)
			System.out.println(Number1 + " is the greatest.");
		else if (Number2>Number3)
			System.out.println(Number2 + " is the greatest.");
		else 
			System.out.println(Number3 + " is the greatest.");
	}
}
