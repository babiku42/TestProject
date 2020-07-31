package day1;

import java.util.Scanner;

public class Reverseandarray {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("enter the numeber");
int l= in.nextInt();

int [] array= new int [l];
for (int i= 0; i<l; i++) {
	System.out.println("enter the elements");
	array[i]= in.nextInt();	
}
	for (int i=0; i<l;i++) {
		  System.out.print((array[i]));
		
}System.out.println();
	for (int i=l-1; i>=0; i--) {
		System.out.print((array[i]));
	}
	}

}
