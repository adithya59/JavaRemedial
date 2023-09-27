/***********************************************************************************************
 * Name				:CubeofnNumbers.java
 * Description		:Java program to display the cube of the given number up to an integer.
 * Author			:Adithya P Binu
 * Version			:1.0
 * Date				:27/09/2023
 * *********************************************************************************************/
import java.util.Scanner;
public class CubeofnNumbers {
	public static void main(String[] args) {
		int num,res=0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); 
		for (int i=1;i<=num;i++) {
			res=i*i*i;
			System.out.println("Cube of "+i+" is "+res);
		}
	}
}
