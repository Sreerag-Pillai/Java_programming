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
* Output:  Account balance (int)
*          
* 
* Algorithm: 
*      Create Scanner to obtain input from command window
*      Create Account objects
*      Display initial balance of each object
*      Test for debit 
*      Deposit amount from user
*      Add to account balance and display balance
*      Testing for credit and debit at the same time
*      Obtain user input for credit and add to account balance
*      Obtain user input from debit and add to account balance
*      Display account balance
***********************************************************************/ 


package account;


import java.util.Scanner;

public class AccountTest
{
   	// main method begins execution of Java application
   public static void main( String[] args ) 
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
      double initial_balance;
      System.out.print( "Enter initial balance amount for your account: " ); 
      initial_balance = input.nextDouble();//asking user to input initial amount
      
      // create Account objects
      Account account = new Account(initial_balance); 
      // display initial balance of each object
      System.out.printf( "account balance: $%.2f\n", account.getBalance() );
     
 
      //testing for debit 
      System.out.print( "Enter amount you want to spend from your account: " ); 
      double Amount; 	// deposit amount from user
      Amount = input.nextDouble(); 	// user input
      System.out.printf( "\nsubtracting %.2f form account balance\n",Amount );
      account.debit( Amount );	 // add to account balance
      	// display balances
      System.out.printf( "account balance: $%.2f\n", account.getBalance() );

      
      //testing for credit and debit at the same time
      System.out.print( "Enter deposit amount for account: " ); 
      Amount = input.nextDouble(); // obtain user input
      System.out.printf( "\n adding %.2f to account balance\n\n",Amount );
      account.credit( Amount );
      // display balances
      System.out.printf( "account1 balance: $%.2f\n", account.getBalance() );
      System.out.print( "Enter amount you want to spend from your account: " ); 
      Amount = input.nextDouble(); 	// user input
      System.out.printf( "\n subtracting %.2f form account balance\n\n",Amount );
      account.debit( Amount );	 // add to account balance
      	// display balances
      System.out.printf( "account balance: $%.2f\n", account.getBalance() );

   } // end main
} // end class AccountTest