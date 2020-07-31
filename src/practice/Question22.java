package practice;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);
System.out.println("enter the number");
int a = input.nextInt();
for (int  i=1; i<=10; i++) {
	int mul= a*i;
	System.out.println( a+"*"+i+"="+ mul);
}
	}

}
