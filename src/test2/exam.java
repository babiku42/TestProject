package test2;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   System.out.println("enter your choice :");
  int  C = input.nextInt();
   switch (C) {
   case 1 :
	   System.out.println("enter the number");
	   int a = input.nextInt();
	   Test2.sumAndProduct(a);
	   break;
   case 2:
	   System.out.println("enter the number");
	   int p = input.nextInt();
	   Test2.firstNthPrime(p);
	   break;
   case 3:
	   System.out.println("enter the number");
	   int f = input.nextInt();
	   
	   default:
		   System.out.println("Thank you");
   }

	}

}
