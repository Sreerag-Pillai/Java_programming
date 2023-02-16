/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  02, 14,2023
* 
* Assignment #3:  program 2: Account
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: Account and AccountTest
* 
* Purpose:  The program will let user open a bank account with an initial amount and will let user spend and deposit to the account .  
* 
* Preconditions/Assumptions:  Account will not have a initial balance less than 0.
* 
* Output:  Account balance (int),
*          
* 
* Algorithm: 
*      Constructing methods to alter the account balance.
*          
***********************************************************************/ 
package account;

public class Account
{   
   	// instance variable stores balance
private double balance; 

   // constructor  
   public Account( double initialBalance )
   {
   		// validate that initialBalance is greater than 0.0; 
   		// if not, balance is initialized to default value 0.0
      if ( initialBalance > 0.0 ) 
         balance = initialBalance; 
      else  balance = 0;
   }// end Account constructor

   // credit (add) an amount to the account
   public void credit( double amount )
   {      
      balance = balance + amount; // add amount to balance 
   } // end method credit

   // debit (subtract) an amount from the account
   public void debit( double amount )
   {if ((balance-amount) >= 0)      
      balance = balance - amount; // subtract amount from balance
    else System.out.println("you do not have enough money in your account to cover this transaction");
   } // end method debit

   // return the account balance
   public double getBalance()
   {
      return balance; // value balance to calling method
   } // end method getBalance

} // end class Account}
    

