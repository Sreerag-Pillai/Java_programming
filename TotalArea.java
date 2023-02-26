/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  02, 25,2023
* 
* Assignment #6:  CalcArea
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: CalcArea and TotalArea
* 
* Purpose:  To calculate the area of three different shapes with different combination of dimension.  
* 
* Preconditions/Assumptions:  
* 
* Output:  area (double), totalArea(double)
* 
* Algorithm: 
*         Declare required variables
*         Ask the user if they would like to start the program
*         Construct a while loop with sentinel control which will terminate if the user input is 0
*         Ask for which shape that user would like to start with rectangle = 1, circle =2, triangle =3
*         Calculate the area using the public methods constructed in CalcArea depending on the user input in the previous question
*         Output shape, dimension, area of the shape and total area
*         Ask user if they would like to continue
*         if they do another iteration of while will start
*         if they do not the program will print total area at the end. 
***********************************************************************/ 
import java.util.Scanner;
public class TotalArea {
    public static void main (String[]arg){
       
    Scanner input = new Scanner(System.in); //creating input object
    
    // declaring varibales to store total area and areas of each shape
    double area;
   
    double totalArea = 0;
    
    System.out.print("To start enter 1: ");//asking user if they would like to start the program
    int userInput; //initating loop variable and getting input from user
    userInput = input.nextInt();
    
    while (userInput != 0) //initiating sentinal control while loop
    {
        //asking user to select shape
       System.out.printf("what shape would you like \nEnter 1 for Rectangle \n      2 for circle\n      3 for trianlge \nSelect one from above options: ");
       int shapeInput;
       shapeInput = input.nextInt(); 
       switch (shapeInput)//constructing swithc case satament to get area for the shape according to user input
       {
           case 1 -> //first case is to calculate rectangle
           {
               System.out.printf("Enter the length of rectangle in meters:  "); //asking for length of rectangle
               double length = input.nextDouble();
               System.out.printf("Enter the breadth of rectangle in meters:  "); //asking for breadth of rectangle
               double breadth = input.nextDouble();
               System.out.printf("How many recatnagles of this dimension would you like to add (enter (1 -10)):  "); //asking for number of rectangles
               double num = input.nextDouble();
               area = CalcArea.getRecArea(length, breadth, num); //calculating area of rectangle using method from CalcArea class
               
               totalArea += area; //incrementing totalArea
               //printing shape area and total area with shape dimention
               System.out.printf("%.2f rectancle with length %.2f meter and breadth %.2f meter have an area of %.2f sq.meters \nYour total Area became %.2f sq.meters\n", num, length, breadth, area, totalArea);
               break;
               
           }//end case 1
           
           case 2 -> //second case is to calculate circle
           {
               System.out.printf("Enter the radius of rectangle in meters:  "); //asking for radius of circle
               double radius = input.nextDouble();

               System.out.printf("How many circle of this dimension would you like to add (enter (1 -10)):  "); //asking for number of circle
               double num = input.nextDouble();
               area = CalcArea.getCirArea(radius, num); //calculating area of circle using method from CalcArea class
               
               totalArea += area; //incrementing totalArea
               //printing shape area and total area with shape dimention
               System.out.printf("%.2f meter circle with radius %.2f meter have an area of %.2f sq.meters\nYour total Area became %.2f sq.meters\n", num, radius, area, totalArea);
               break;
           }//end case 2
           
           case 3 -> //third case is to calculate triangle area
           {
               System.out.printf("Enter the height of rectangle in meters:  "); //asking for height of triangle
               double height = input.nextDouble();
               System.out.printf("Enter the breadth of rectangle in meters:  "); //asking for breadth of triangle
               double breadth = input.nextDouble();
               System.out.printf("How many recatnagles of this dimension would you like to add (enter (1 -10)):  "); //asking for number of triangles
               double num = input.nextDouble();
               area = CalcArea.getTriArea(height, breadth, num); //calculating area of triangle using method from CalcArea class
               
               totalArea += area; //incrementing totalArea
               //printing shape area and total area with shape dimention
               System.out.printf("%.2f triangle with height %.2f m and breadth %.2f m have an area of %.2f sq.meters \nYour total Area became %.2f sq.meters\n", num, height, breadth, area, totalArea);
               break;
           }//end case 3
           default -> { 
               System.out.printf("***Invlaid Input***\n ");
                       
               continue;
           }//end default
           
       }//end swith case statement
       
       
        
       
       
       System.out.printf("\nWould you like to add more shapes to the total area\nEnter 1 to add more or 0 to stop: "); // asking user if they would like add more shapes to the existing one
       userInput = input.nextInt();
    
    
    
    }//end while loop


    System.out.printf("\nYou total area is: %.2f\n", totalArea);
    
}// end main method
}//end class TotalArea
