import java.util.Scanner;

public class Solution {
	static int final_result;
	static int sum;

	public static void main(String args[]) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = sc.nextInt();
		sum = give_sum(number);
		solution(number);
	}

	public static int solution(int N) {

		for (int i = N + 1; sum != give_sum(i); i++) {
			if (sum == give_sum(i + 1)) {
				final_result = i + 1;
			}
		}
		System.out.println("Final Digit " + final_result);
		return final_result;

	}

	public static int give_sum(int number) {
		int digit, sum = 0;

		while (number > 0) {
			// finds the last digit of the given number
			digit = number % 10;
			// adds last digit to the variable sum
			sum = sum + digit;
			// removes the last digit from the number
			number = number / 10;
		}
		// prints the result
		return sum;
	}
}