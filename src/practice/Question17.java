package practice;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("enter the Year");
int y= input.nextInt();
if (y%4==0 && y%100!=0) {
	System.out.println("its a leap year");
}else if
(y%400==0) {
	System.out.println("its a leap year");
	
}
else {
	System.out.println("its not a leap year");
}
	}

}
