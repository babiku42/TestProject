package practice;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
System.out.println("Hello\nGood morning\nHow are you?");
Scanner input = new Scanner(System.in);
System.out.println("enter the number");
double a = input.nextDouble();
double b= input.nextDouble();
double  ave = (a+b)/2;
System.out.println("The average of the given numebers is"+ ave);
input.close();
	}

}
