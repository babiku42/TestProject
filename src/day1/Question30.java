package day1;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the limit");
		int n = input.nextInt();
		int n1 = 1;
		int n2 = 1;
		int sum = 0;
		System.out.print(n1 + " " + n2+" ");
		for (int i = 1; i <= n; i++) {
			sum = n1 + n2;
			System.out.print(sum + " ");
			n1 = n2;
			n2 = sum;
		}
		input.close();
	}
}
