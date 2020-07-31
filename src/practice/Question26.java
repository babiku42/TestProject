package practice;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the number");
int a= input.nextInt();
int rev=0;

while(a>0) {
	
		rev= rev*10+ a%10;
		a= a/10;
	
	
}System.out.println(rev);
	}

}
