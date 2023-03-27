/************************************************************************
* Programmer:  Sreerag M Pillai
*
* Course:  CSCI 1471
*
* Date:  03, 18, 2023
*
* Assignment #7: Array of 30 numbers
*
* Environment:  Java with Netbeans IDE
*
* Files Included:Array_of_30.java, ArrayCalculation.java
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

public class ArrayCalculation {
    
    public static int maximum (int array[]){
        int maximum = 0;
        for (int num : array ){
           if (num > maximum){
               
               maximum = num; // using the if branch inside the for loop to assign maximum value in the array
           }  
        }//end for loop
        return maximum;
    }//end maximum
    
    public static int minimum (int array[]){
        
        int minimum = 100;
        for (int num : array ){
            
           if (num < minimum){
               minimum = num; // using the if branch inside the for loop to assign minimum value in the array
           }  
        }//end for loop
        return minimum;
    }//end minimum
    
    public static double average (int array[]){
        
        double average ;
        double sum = 0;
        double count = 0;
        //constructing for loop to get sum and count for average calculation
        for (double num : array ){
            
               sum += num;
               count += 1;
        }//end for loop
        average = sum/count;
        return average;
    }//end average
    
    public static void barchart(int array []){
        
        int [] frequency = new int [10];// creating an array called frequency and setting it's length to 10
        
        //constructing for loop to increment values in frequency array
        for(int num:array){
            int index = num/10;
            
            if (index == 10){
                index = 9;
            }
            ++frequency[index];
                
        }//end for loop
        
        //printing astericks corresponding to frequency counts
        for(int freq = 0; freq < frequency.length; freq++){
            switch (freq) {
                case 0 -> System.out.printf("\n%4d - %4d ", 1, 9 );
                case 9 -> System.out.printf("\n%4d - %4d ", 90, 100 );
                default -> System.out.printf("\n%4d - %4d ", freq*10, freq*10+9 );
            }
            
         

            
            //constructing for loop to print number of astrics according to the corresponding frequency
            for(int star = 0; star < frequency[freq]; star++){
                
                System.out.print("*");
            }
            
        }//end for loop
        
        System.out.println("");
        
    }//end of barchart method
    
    
}//end ArrayCalculation
