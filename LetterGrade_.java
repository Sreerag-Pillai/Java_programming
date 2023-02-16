/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  02, 14,2023
* 
* Assignment #3:  program 1: Letter Grade
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: LetterGrade
* 
* Purpose:  To calculate average grade and letter grade from user input using
*           a while loop with a sentinel and if else condition.  
* 
* Preconditions/Assumptions: Student score will not be zero for any exam and 
*                            user will only enter positive integer between 1 and 100 for grades.
* 
* Output:  Letter Grade (String), and Average Score (Int).
*          
* 
* Algorithm: 
*      Getting input from the user
*      Constructing variable called sum to get sum of grades  
*      Constructing variable called num to get number of loop iterations
*      Constructing a while loop and incrementing both variables
*      If else statement block for assigning letter grades
*      calculating and outputting average grade
***********************************************************************/ 



package lettergrade;


import java.util.Scanner;
/**
 *
 * @author manga
 */
public class LetterGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner input = new Scanner (System.in); //creating object called input
System.out.print("Enter Grade (integer 1-100): ");
    int grade;
    grade = input.nextInt();//getting input from the user

int sum;
sum = 0; //constructing variable called sum to get sum of grades

int num;
num = 0; //constructing variable called num to get number of loop iterations

System.out.println();

while (grade > 0)
{ 
    sum += grade;//incrementing both values
    num += 1;
    
//constructing if else statement block for assigning letter grades
    if (grade >= 90)
            {
               System.out.println("Your Letter Grade is: A"); 
            }
    else if (grade >= 80)
            {
               System.out.println("Your Letter Grade is: B"); 
            }
    else if (grade >= 70)
            {
                System.out.println("Your Letter Grade is: C");
            }
    else if (grade >= 60)
            {
                System.out.println("Your Letter Grade is: d");
            }
    else
            {
                System.out.println("Your Letter Grade is: F");
            }


System.out.print("Enter next Grade (integer 1-100): ");
grade = input.nextInt();
}

float avg;
avg = sum / num; //calculating average

System.out.printf("The average for these %d grades is: %.2f\n",num,avg);

    }    
    
    
}
