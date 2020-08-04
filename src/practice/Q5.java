package practice;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("enter the radius of the circle");
double r = in.nextDouble();
double area = Math.PI* Math.pow(r,2);
System.out.println("The area of circle is :" + area);
System.out.println("enter the value of a, b ,c");
double a= in.nextDouble();
double b= in.nextDouble();
double c= in.nextDouble();

double s= (a+b+c)/2;
double areas = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of the triange is :" + areas);
in.close();

	}

}
