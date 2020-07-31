package practice;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
     String d= "";
		
	
		do {
			System.out.println("1. Open a new Bank Account");
			System.out.println("2. Deposit money to Bank");
			System.out.println("3. Withdraw money from Bank");
			System.out.println("5. Exit");
			System.out.println("Enter your Choice");
			int user_choice = input.nextInt();
		switch (user_choice) {
		case 1:
			
			Scanner input1= new Scanner(System.in);
			System.out.println("Enter your First Name and Last Name");
			String name = input1.nextLine();
			
			System.out.println("Enter the amount if you want to deposit in your new account");
			double initialBalance = input.nextInt();
			
			if (initialBalance == 0) {
				BankingJava ob= new BankingJava(name);
				ob.setName(name);
			} else {
				BankingJava obj1= new BankingJava(name, initialBalance);
				obj1.setInitialBalance(initialBalance);
				obj1.setName(name);
				
			}
			System.out.println("Thank you!!!\n Your account is created");
			break;
		case 2:
			
			System.out.println("Enter the account number");
			int accountNum = input.nextInt();
			System.out.println("Enter the amount to be deposited");
			double amount = input.nextDouble();
			BankingJava ob1= new BankingJava();
			ob1.setAccountNum(accountNum);
			ob1.deposit(amount);
			break;
			
		case 3:
			System.out.println("Enter your account number");
			accountNum= input.nextInt();
			System.out.println("Enter your the amount that you want to withdrawl");
            amount= input.nextDouble();
            BankingJava ob5= new BankingJava();
            ob5.setAccountNum(accountNum);
           
            ob5.withdraw(amount);
            break;
	
		default:
				System.out.println("Invalid!!!!!");
				
		}	
            System.out.println("Press y/y to continue");
            
	     d= input.next();
			
			
			
			
			

		}while(d.equalsIgnoreCase("y"));
			System.out.println("Thank you");
		
			
		input.close();
	}

	}

