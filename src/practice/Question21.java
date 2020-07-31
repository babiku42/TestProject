package practice;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);
String decision="";
do {
System.out.println("enter the number as per your day choice");
System.out.println("enter your choice");
int choice = input.nextInt();
switch(choice) {
case 1:
	System.out.println("Sunday");
break;
case 2:
	System.out.println("Monday");
break;
default:
	System.out.println("Thank you");

}
System.out.println("DO you want to continue? press y to continue");
decision= input.next();

}while(decision.equalsIgnoreCase("y"));
System.out.println("THank you");	}

}
