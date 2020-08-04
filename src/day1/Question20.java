package day1;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter first number");
int a= input.nextInt();
System.out.println("enter the second number");
int b = input.nextInt();
System.out.println("enter your choice");
char choice= input.next().charAt(0);
switch (choice) {
case '+':
	int sum = a+b;
	System.out.println(+sum);
	break;
case '-':
	int sub = a-b;
	System.out.println(+sub);
	break;
case '/':
	int div= a/b;
	System.out.println(+div);
	break;
case '*':
	int mul= a*b;
System.out.println(+mul);
default:
	System.out.println("we dont have your choice");
}
input.close();
	}

}
