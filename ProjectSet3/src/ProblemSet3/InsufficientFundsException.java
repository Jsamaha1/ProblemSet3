package ProblemSet3;

public class InsufficientFundsException extends Exception
{
   private double amount;
   // Creates the insufficient funds exception for use in Account.java
   public InsufficientFundsException(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
}