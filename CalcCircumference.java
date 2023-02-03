/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  01, 28,2023
* 
* Assignment #2:  Program #2:  CalcCircumfernce
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: CalcCircumference
* 
* Purpose:  To calculate the diameter, area and circumference of
*           a circle from the user inputted radius.
* 
* Input:  any positive integer as radius (integer) 
* 
* Preconditions/Assumptions:  Only positive integers are input 
* 
* Output:  Diameter (double), Area (float), Circumference (double)
* 
* Algorithm: 
*      input user radius
*      calc diameter
*      calc area
*      calc circumference
*      output diameter
*      output area
*      output circumference
***********************************************************************/ 

import java.util.Scanner;

public class CalcCircumference {
    public static void main( String[] args)
    {
    Scanner input = new Scanner (System.in);
    
    
    
    System.out.print("Enter radius: ");
    int user_rad;
    user_rad = input.nextInt(); //getting user input for radius
    
   //calculating and printing diameter, area and circumference
   System.out.printf("Diameter is: %d\n", (2*user_rad));
   System.out.printf("Area is: %f\n", (Math.PI*user_rad*user_rad));    
   System.out.printf("Circumference is: %f\n", (2*Math.PI*user_rad));
         } 
    
}
