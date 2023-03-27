/************************************************************************
* Programmer:  Sreerag M Pillai
*
* Course:  CSCI 1471
*
* Date:  03, 18, 2023
*
* Assignment #7: TwoArrays
*
* Environment:  Java with Netbeans IDE
*
* Files Included: TwoArrays.java
*
* Purpose: The purpose of this code is to print the values of two 2D arrays and calculate their average.
*
* Preconditions/Assumptions:
*          - The input arrays should be 2D arrays of integers.
*
* Output:  The code prints the values of two 2D arrays and their averages.
*
* Algorithm:
*          1. Create a class named TwoArrays.
*          2. Define the main() method.
*             a. Initialize two 2D arrays of integers (array1 and array2) with given values.
*             b. Print the values in array1 using the printValue() method.
*             c. Calculate and print the average of array1 using the average() method.
*             d. Print the values in array2 using the printValue() method.
*             e. Calculate and print the average of array2 using the average() method.
*          3. Define the printValue() method that takes a 2D array of integers as input.
*             a. Iterate through the input 2D array.
*             b. Print the values in the 2D array by row.
*          4. Define the average() method that takes a 2D array of integers as input.
*             a. Initialize variables 'count', 'sum', and 'average' to 0.
*             b. Iterate through the input 2D array.
*             c. Add each value to the sum and increment count.
*             d. Calculate the average as sum divided by count.
*             e. Return the average.
*          5. End the TwoArrays class.
************************************************************************/


package pkg2d_array;


public class TwoArrays {
    
    
    public static void main(String[] args) {
        
        int [] [] array1 = {{2,3},{4,6,4},{5,4,0}};
        int [] [] array2 = {{1,5,3},{6,8,9}};
        System.out.println("Values in array1 by row are:");
        printValue(array1);//printing out all values in array1 using the method printValue
        
        System.out.print("The average value of array1 is: ");
        System.out.printf("%.1f\n\n",average(array1));//print the average of all values in array1
        
        System.out.println("Values in array1 by row are:");
        printValue(array2);//printing out all values in array2 using the method printValue
        
        System.out.print("The average value of array1 is: ");
        System.out.printf("%.1f\n",average(array2));//print the average of all values in array1
    }//end main method
    
    public static void printValue(int array [] []){
        
        // constructing for loop to print out the values
        for (int [] row: array ){
            for (int col: row){
                System.out.print(col+ " ");
            }//end of for loops for coloumns
            System.out.println("");
        }//end for loop for rows
    }//end printVlaue method
    
    public static double average(int array [] []){
        double count = 0;
        double sum = 0;
        double average;
        //constructing for loop to iterate through all elements of array
        for (int[] row: array){
            for (double col: row){
                sum += col;
                count += 1;
            }//end for loop for coloumns
        }//end for loop for rows
        average = sum/count;
        return average;
    }//end method average
    
    }// end of class TwoArrays
    



