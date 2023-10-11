/************************************************************************************************************
 * File					:Triangle.java
 * Description			:a Java program to display the pattern like a right angle triangle with a number
 * @author Student		:Adithya P Binu
 * Version				:1.0
 *Date					:11/10/2023
 ***********************************************************************************************************/
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row = sc.nextInt();
		for (int i=1;i<=row;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}
