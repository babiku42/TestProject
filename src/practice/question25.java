package practice;

import java.util.Scanner;

public class question25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of student");
		int n= input.nextInt();
		String student1= "";
		int score1=0;
	
		for (int i=1;i<=n; i++) {
			input.nextLine();
			System.out.println("enter the name of student ");
			String student2= input.nextLine();
			System.out.println("enter the score of student");
			int score2= input.nextInt();
		
		if(score2>score1) {
			student1= student2;
			score1= score2;
		}}
		System.out.println(student1 +"" + score1);
			
		
	
}
	}


