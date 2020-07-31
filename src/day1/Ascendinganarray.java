package day1;

import java.util.Scanner;

public class Ascendinganarray {

	public static void main(String[] args) {
	int	temp=0;
Scanner in= new Scanner (System.in);
System.out.println("enter the size");
int s= in.nextInt();
int [] array= new int[s];
int i;
for (i= 0; i<s; i++) {
	System.out.println("enter the elements");
	array[i]= in.nextInt();
}
for (i=0; i<s; i++) {
	System.out.print(array[i]);
	
}System.out.println();
for (i=0; i<s; i++) {
	for (int j=i+1; j<s; j++) {
		System.out.print(array[j]);
		
	
}
	
		
	}

	}

}
