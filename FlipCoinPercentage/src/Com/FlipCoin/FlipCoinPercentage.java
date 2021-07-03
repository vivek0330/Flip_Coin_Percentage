package Com.FlipCoin;

import java.util.Scanner;

public class FlipCoinPercentage {

	public static void main(String[] args) {

		// Constant Variables
		int HEAD = 0;
		int TAIL = 0;
		
		// Getting a value from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of coins you want to flip");
		int in = sc.nextInt();

		for (int i = 1; i <= in; i++) {

			// get a random value between 0 to 1
			double RANDOM = Math.random();
			if (RANDOM < 0.5) {
				HEAD++;
			} else {
				TAIL++;
			}
		}

		// Show how many times get head and tail
		System.out.println("Getting Head: " + HEAD + " Times");
		System.out.println("Getting Tail: " + TAIL + " Times");

		// Show Percentage
		float Percentage_Head = (HEAD * 100) / 10;
		float Percentage_Tail = (TAIL * 100) / 10;

		System.out.println("Head_Percentage: " + Percentage_Head + "%");
		System.out.println("Tail_Percentage: " + Percentage_Tail + "%");

	}

}
