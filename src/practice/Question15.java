package practice;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the char");
char ch = input.next().charAt(0);
int n= ch;
System.out.println("The Ascii value of" +ch+"is:" +n );
System.out.println("enter the number");
int num = input.nextInt();
if (num>=97 && num<=128) {
System.out.println("the Ascii code  ofthe given is  "+(char)num);}
else { 
	System.out.println("Ivalid number");
}
	input.close();

		
	}

}
