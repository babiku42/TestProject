package practice;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the side a");
		int a = input.nextInt();
		System.out.println("enter the side b");
		int b = input.nextInt();
		System.out.println("enter the side c");
		int c = input.nextInt();
		if (a > b && a> c) {
			System.out.println(a + "is the greatest num");

		} else if (b > c && b> a) {
			System.out.println(b + "is the greatest num");

		} else {
			System.out.println(c + "is the greatest num");
		}
		input.close();
	}

}
