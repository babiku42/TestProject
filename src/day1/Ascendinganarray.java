package day1;

import java.util.Scanner;

public class Ascendinganarray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter the size");
		
		int s = in.nextInt();
		int temp=0;
		int[] array = new int[s];
		int i;
		for (i = 0; i < s; i++) {
			System.out.println("enter the elements");
			array[i] = in.nextInt();
		}
		

		System.out.println();
		for (i = 0; i < s; i++) {
			for (int j = i + 1; j < s; j++) {
				if (array[i]>array[j]){
					temp= array[i];
					array[i]= array[j];
					array[j]=temp;
					
				}

			}

		}System.out.println("Ascending numbers are sorted :");
		for ( i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}

		in.close();
	}

}
