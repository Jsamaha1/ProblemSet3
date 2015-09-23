package ProblemSet3;

public class Test {

	public static void main(String[] args) {
		Account testAccount = new Account(1122, 20000);
		testAccount.setAnnualInterestRate(4.5);
		try {
			testAccount.withdraw(55500);
		} catch (InsufficientFundsException e) {
			System.out.printf("You are short $%.2f\n", e.getAmount());
			e.printStackTrace();
		}
		testAccount.deposit(3000);
		System.out.println("Your balance is $" + testAccount.getBalance());
		System.out.println("Monthly interest rate: %" + testAccount.getMonthlyInterestRate());
		System.out.println("Account Created on: " + testAccount.getDateCreated());
	}

}
