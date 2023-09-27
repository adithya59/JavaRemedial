/***********************************************************************************************
 * Name				:MultiplicationTable.java
 * Description		:Java program to display the multiplication table of a given integer. 
 * Author			:Adithya P Binu
 * Version			:1.0
 * Date				:27/09/2023
 * *********************************************************************************************/
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		int n,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		System.out.println("Multiplication Table of "+n+" is :");
		for (int i=1;i<=10;i++) {
			res=n*i;
			System.out.println(n+" * "+i+" = "+res);
		}
	}
}
