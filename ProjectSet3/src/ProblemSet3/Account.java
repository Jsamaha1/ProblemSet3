package ProblemSet3;

import java.util.Date;

public class Account {
	// Initiates the variables, and makes them private to ensure the program is encapsulated.
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	//Creates the constructor
	public Account() {
		//No arg constructor
		dateCreated = new Date();
	}
	
	// Argument taking constructor that creates an account with speceifed values
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	
	// Accessor and Mutator for id
	public int getId(){
		return this.id;
	}
	
	public void setID(int idValue){
		this.id = idValue;
	}
	
	// Accessor and Mutator for balance
	public double getBalance(){
		return this.balance;
	}
	
	public void setBalance(double newBalance){
		this.balance = newBalance;
	}
	
	// Accessor and Mutator for annualInterestRate
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newRate){
		this.annualInterestRate = newRate;
	}
	
	// Accessor for dateCreated
	public Date getDateCreated(){
		return this.dateCreated;
	}
	
	// Method to get the monthly interest rate
	public double getMonthlyInterestRate(){
		return (this.annualInterestRate / 12);
	}
	
	// A method to withdraw from the account
	public void withdraw(double withdrawn) throws InsufficientFundsException{
		if(this.balance >= withdrawn){
			balance -= withdrawn;
		} else {
			double needed = withdrawn - balance;
			throw new InsufficientFundsException(needed);
		}
	}
	
	// A method to deposit from the account
	public void deposit(double deposited){
		balance += deposited;
	}
		

}
