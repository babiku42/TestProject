package test2;

import java.util.Scanner;

public class Test2 {
	public static void sumAndProduct(int a) {
		int sum=0;
		int mul= 1;
	int rev= 0;
		while (a>0) {
			 rev = a %10;
			mul = mul* rev;
			sum= sum +rev;
		}
		System.out.println("sum :"+sum);
		System.out.println( "mul :" +mul);
		
	}
	public static void firstNthPrime(int p) {
	int n= 1;
	int c = 0;
	int i;
	while (c<p) {
		n=n+1;
		for ( i=2; i< n; i++ ) {
		if (n%i==0) {
			break;
		}
		if (i==n) {
			c= c+1;
		}}
	System.out.println("nth prime number is" +n);
	}
	}
	public void fibonaci(int f) {
		int n1= 1;
		int n2= 1;
		int n3=0;
		int i;
		System.out.println(n1);
		for (i= 0; i<f; i++) {
			n3 = n1+n2;
			System.out.println( n3 + " ");
		n1=n2;
		n2=n3;
		}
		
	}
public static void reverser(int length) {

	int [] ar= new int[length];
	for(int i=0; i<ar.length; i++) {
		System.out.println(ar[i]);
	}
	System.out.println();
	for (int i=ar.length-1; i>=0; i--) {
		System.out.println(ar[i]);
}}

	public static void main(String[] args) {

	}

}
