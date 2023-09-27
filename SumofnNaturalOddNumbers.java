/***********************************************************************************************
 * Name				:SumofnNaturalOddNumbers.java
 * Description		:Java program that displays the sum of n odd natural numbers. 
 * Author			:Adithya P Binu
 * Version			:1.0
 * Date				:27/09/2023
 * *********************************************************************************************/
import java.util.Scanner;
public class SumofnNaturalOddNumbers {
	public static void main(String[] args) {
		int limit,res=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		limit = sc.nextInt();
		for(int i=1;i<=limit;i+=2) {
			res=res+i;
		}
		System.out.println("Sum of "+limit+" natural odd numbers:"+res);
	}
}
