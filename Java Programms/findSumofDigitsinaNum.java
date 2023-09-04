package ujjinesh;

import java.util.Scanner;

public class findSumofDigitsinaNum {

	public static void main(String[] args) {

		int num, digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num::");

		num = sc.nextInt();
		while (num > 0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println("Sum of Digits ::" + sum);
	}

}
