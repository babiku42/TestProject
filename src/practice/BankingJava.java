package practice;

public class BankingJava {
private String name;
private double initialBalance;
private int accountNum;
private static int accountNumber=1000;
private static int transactionFees= 2;
private static double interest= 0.07;

public  BankingJava(String name) {
	this.name= name;
	this. initialBalance=0;
	this.accountNum=accountNumber++;	
	info();
}
public BankingJava() {
	
}


public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}



public void setInitialBalance(double initialBalance) {
	this.initialBalance = initialBalance;
}
public double getInitialBalance() {
	return initialBalance;
}

public void setAccountNum(int accountNum) {
	this.accountNum = accountNum;
}

public int getAccountNum() {
	return accountNum;
}

public static void setAccountNumber(int accountNumber) {
	BankingJava.accountNumber = accountNumber;
}
public static int getAccountNumber() {
	return accountNumber;
}


public static void setTransactionFees(int transactionFees) {
	BankingJava.transactionFees = transactionFees;
}
public static int getTransactionFees() {
	return transactionFees;
}

public  BankingJava(String name, double initialBalance) {
	this.name= name;
	this.initialBalance=initialBalance;
	this.accountNum =accountNumber++;
	info();
}
public void deposit(double amount) {
	if (amount==0) {
		initialBalance= initialBalance+amount;
	}info();
}
public void  deposit(double amount, double interest) {
	initialBalance= initialBalance +amount;
	initialBalance= initialBalance+(initialBalance*interest/100);
	info();
}
public void withdraw(double amount) {
	initialBalance = initialBalance-(amount+transactionFees);
	
}
public void info() {
	System.out.println("==================");
	System.out.println("Account Name is: " + getName());
	System.out.println("Account number is: " + getAccountNum());
	System.out.println("Balance is: " + getInitialBalance());
	System.out.println("==================");
}


}
