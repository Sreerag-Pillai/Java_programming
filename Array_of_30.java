/************************************************************************
* Programmer:  Sreerag M Pillai
*
* Course:  CSCI 1471
*
* Date:  03,18, 2023
*
* Assignment #7: Array of 30
*
* Environment:  Java with Netbeans IDE
*
* Files Included: Array_of_30.java, ArrayCalculation.java
*
* Purpose: The purpose of this code is to find the maximum, minimum, and average of a given array of integers,
*          and also to generate a bar chart representing the frequency of numbers within the array.
*
* Preconditions/Assumptions:
*          - The input array should be of integers.
*
* Output:  The code prints the bar chart, and returns the maximum (int), minimum (int), and average (double) of the array.
*
* Algorithm:
*          1. Create a class named ArrayCalculation.
*          2. Define the maximum() method that takes an array of integers as input.
*             a. Initialize a variable 'maximum' to 0.
*             b. Iterate through the input array.
*             c. If a value is greater than the current maximum, update the maximum value.
*             d. Return the maximum value.
*          3. Define the minimum() method that takes an array of integers as input.
*             a. Initialize a variable 'minimum' to 100.
*             b. Iterate through the input array.
*             c. If a value is less than the current minimum, update the minimum value.
*             d. Return the minimum value.
*          4. Define the average() method that takes an array of integers as input.
*             a. Initialize variables 'sum' and 'count' to 0.
*             b. Iterate through the input array.
*             c. Add each value to the sum and increment count.
*             d. Calculate the average as sum divided by count.
*             e. Return the average.
*          5. Define the barchart() method that takes an array of integers as input.
*             a. Create an array named 'frequency' with a length of 10.
*             b. Iterate through the input array.
*                i. Calculate the index by dividing the number by 10.
*               ii. If the index equals 10, set the index to 9.
*              iii. Increment the value at the corresponding index in the frequency array.
*             c. Iterate through the frequency array.
*                i. Print the range of numbers corresponding to each index.
*               ii. Print asterisks according to the value at each index in the frequency array.
*             d. Print a newline character.
*          6. End the ArrayCalculation class.
************************************************************************/




package hw7;

import java.util.Random;

public class Array_of_30 {

public static void main(String[] args) {
        
    
   int [] arr = new int [30];//initiating array and assigning it lenght to 30
   Random num = new Random();
   
    // assigning random values to each index in arr
   for(int indx = 0; indx < arr.length; ++indx){
        arr[indx] = 1 + num.nextInt(100);
    }// end for loop
   
  System.out.print("\nArray values = ");
   for (int indx : arr) {
        System.out.print(indx + " ");
        
    }
    System.out.printf("\nArray legth = %d",arr.length);
    System.out.printf("\nMaximum value = %d",ArrayCalculation.maximum(arr));
    System.out.printf("\nMinimum value = %d",ArrayCalculation.minimum(arr));
    System.out.printf("\nAverage = %.2f\n",ArrayCalculation.average(arr));
    System.out.printf("\nFrequency Disribution Bar Graph");
   ArrayCalculation.barchart(arr);
   
   

    
}//end main
        
}//end Array_of_30
        

