package day1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the first number");
int a= input.nextInt();
System.out.println("enter the second numeber");
int b = input.nextInt();
a= a+b;
b= a-b;
a= a-b;
System.out.println(+a);
System.out.println(+b);
input.close();

	}

}
