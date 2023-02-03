/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  02, 1,2023
* 
* Assignment #2:  Program #3:  SpaceTheDigits
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: SpaceTheDigits
* 
* Purpose:  To get a 5 digit number from user and print out by
*           spacing each digits
* 
* Input:  5 digit nunber (integer)
* 
* Preconditions/Assumptions:  Only positive integers are input and user entering
*                             correct amount of digits
* 
* Output:  user number and 5 digits (double)
* 
* Algorithm: 
*      Input User number
*      dividing user number
*      Output user number and 5 digits
*          
***********************************************************************/ 
import java.util.Scanner;

public class SpaceTheDigits {
    
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter a five digit number: ");
        int user_num;
        user_num = input.nextInt();
        
        //defining each digits into 5 seperate ones
        int first_digit = user_num / 10000;
        int second_digit = ((user_num / 1000)%10);
        int third_digit = ((user_num / 100)%10);
        int fourth_digit = ((user_num / 10)%10);
        int fifth_digit = (user_num %10);
        
        //Spacing all digits using print
        
        System.out.printf("Digits in %d are %d %d %d %d %d ", user_num,first_digit, second_digit, third_digit, fourth_digit,fifth_digit);
        
    }
    
}
