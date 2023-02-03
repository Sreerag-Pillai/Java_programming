/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  01, 28,2023
* 
* Assignment #2:  Program #1:  OddOrEven
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: EvenOrOdd
* 
* Purpose:  To decide if the user number is odd or even  
* 
* Input:  any positive integer (integer) 
* 
* Preconditions/Assumptions:  Only positive integers are input 
* 
* Output:  The user number is odd or even
* 
* Algorithm: 
*      Input User number
*      Determining the user number is odd or even
*      Output the user number type (odd or even)
*          
***********************************************************************/ 

import java.util.Scanner;
public class EvenOrOdd {
    public static void main( String[] args)
    {
    Scanner input = new Scanner (System.in);
    
    int user_num;
    
    System.out.println("Enter a possitive integer:");
    user_num = input.nextInt();//getting integer from user
    
    //'if' condition to determine the number is odd or even
    if (user_num % 2 == 0) 
        { System.out.printf("The number %d is an even number", user_num);
        } else {System.out.printf("The number %d is odd number",user_num); 
                }  
    System.out.println();
        }
}
