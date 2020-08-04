package practice;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 13;
		int b = 12;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + "and\n " + b);
		input.close();
	}

}
