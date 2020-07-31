package practice;

import java.util.Scanner;

public class Question28 {
	public static boolean prime(int a) {
		boolean prime= true;
		if (a==0 || a==1) {
			prime= false;
		}
		for (int i= 2; i<=a%2;i++) {
		if(a%i==0) {
			prime= false;
			
		}else {
			prime=true;
			System.out.println("its a prime number");
		}
		}
		
	return prime;
	}
	public static void nthPrimenumber(int n) {
		for (int i= 2; i<n;i++) {
			if(prime(i)) {
				System.out.println(i+ " ");
				
			}
		}
		
	}
	public static void primebetween(int s, int e)
	{
		for (int i=s; i<e; i++)
		{
			if(prime(i))
			{
				System.out.println((i+ " "));
			}
		}
	}

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Choices are\n1.Pirmenumber\n2.NthPrime\n3.PrimeNumberBetween");
System.out.println("enter the choice");
int c = input.nextInt();
System.out.println("enter the number");

int a = input.nextInt();
switch(c) {
case 1:
boolean prime= prime(a);
if (prime) {
	System.out.println(a+"is a prime");
}else {
	System.out.println("not a prime num");
}

	break;
case 2:
	System.out.println("enter the nth value");
	int n= input.nextInt();
	nthPrimenumber(n);
	break;
case 3:
	System.out.println("enter the start number");
	int s = input.nextInt();
	
	System.out.println("enter the end number");
	int e= input.nextInt();
	primebetween(s, e);
	
	break;
	default:
		System.out.println("Thank you");
		
	
}

	}

}
