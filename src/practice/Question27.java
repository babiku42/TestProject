package practice;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the number");
int a= input.nextInt();
int rev=0;
int mul= 1;
int sum=0;

while (a>0) {
	rev= a%10;
	mul= mul*rev;
	sum= sum+rev;
	a=a/10;
}
System.out.println("sum ="+sum + "and mul ="+ mul);
	}

}
