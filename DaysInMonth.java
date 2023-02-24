/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  02, 22,2023
* 
* Assignment #3:  program 4: DaysInMonth
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included:  DaysInMonth.java
* 
* Purpose:  To calculate days in a month that is inputted by the user, using switch case  
* 
* Preconditions/Assumptions:  user will only input positive integer
* 
* Output:  year(int), month(int), days(int)
*          
* 
* Algorithm: 
*            Get user input for month and year separately
*            Initiate a variable called days to assign days of user inputted month
*            Construct switch case condition using month as switch expression
*            Use the first case to calculate leap year and to find days in February
*            Use the case 9, 4, 6,11 to assign number of days to 30
*            Use default to assign 31 to rest of the months
*            Print out output month year and days
*          
***********************************************************************/
import java.util.Scanner;
public class DaysInMonth {
public static void main(String[] args) 
{    
Scanner input = new Scanner( System.in);    
int month;
 System.out.print ("Enter month (enter value from 1 to 12): ");
month = input.nextInt();


int year;
 System.out.print ("Enter year (YYYY): ");
year = input.nextInt();

int days;

 switch(month)  {
     
     case 2:
         if (((year % 100 != 0) && (year%4 == 0))||(year%400 == 0))
         days = 29;
         else
         days = 28;
               break;
     case 9:
     case 4:
     case 6:
     case 11:
     { 
         days = 30;
      }
        break;     
     default:
	days = 31;
        break;
}  
System.out.printf("total number of days in month - %d in year - %d is %d\n", month, year, days);
 
}
}
