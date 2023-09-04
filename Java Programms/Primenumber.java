package ujjinesh;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {

		// int num=3;
		// int count=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbber :");
		int count = 0;
		int num = sc.nextInt();

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("prime number");
			} else {
				System.out.println("not a prime number");

			}

		}
	}

}
