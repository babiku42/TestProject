package practice;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
 Scanner input= new Scanner(System.in);
 System.out.println("enter the nth number");
 int n = input.nextInt();
 /*int sum = 0;
 for (int i= 0; i<=n; i++) {
	 sum = sum+i;
 }
 System.out.println(sum);*/
 int mul=1;
 for (int i= 1; i<=n; i++) {

mul = mul*i;

}System.out.println(mul);
	}}

