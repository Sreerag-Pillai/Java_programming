
/************************************************************************
* Programmer:  Sreerag M Pillai
*
* Course:  CSCI 1471
*
* Date:  03, 20, 2023
*
* Assignment #7: ArrayExpansion
*
* Environment:  Java with Netbeans IDE
*
* Files Included:ArrayExpansion.java
*
* Purpose: The purpose of this code is to expand an existing array while preserving its values.
*
* Preconditions/Assumptions:
*          - The input array should be an array of integers.
*
* Output:  The code prints the array before and after each step of the expansion process.
*
* Algorithm:
*          1. Create a class named ArrayExpansion.
*          2. Define the main() method.
*             a. Initialize an array (arr) with given integer values.
*             b. Print the original array using the printValue() method.
*          3. Perform the expansion steps.
*             a. Step 1: Assign the original array to a new array (original).
*             b. Step 2: Create a new, larger array (arr) with the desired size.
*             c. Step 3: Copy the values from the original array to the new array.
*             d. Step 4: Set the original array to null.
*          4. Print the array and the original array after each step of the expansion process.
*          5. Define the printValue() method that takes an array of integers as input.
*             a. Iterate through the input array.
*             b. Print the values in the array.
*          6. End the ArrayExpansion class.
************************************************************************/

public class ArrayExpansion {
    
    public static void main(String[] args) {
        
        
        int [] arr = {4,5,200,2,5,6,7,89,2,4};//initiating the array with 10 integers
        System.out.println("After (a) new array of ten integers");
        System.out.print("arr --> "); 
        printValue(arr);//printing the array
        System.out.println("");
        
        //First Step
        int [] original = arr; //creating a new array and assigning it to arr
        System.out.println("After (a) step 1 of expansion");
        System.out.print("arr --> "); 
        printValue(arr);//printing the array
        System.out.print("original --> "); 
        printValue(original);//printing the array
        System.out.println("");
        
        //Second Step
        arr = new int[15];
        System.out.println("After (b) step 2 of expansion");
        System.out.print("arr --> "); 
        printValue(arr);//printing the array
        System.out.print("original --> "); 
        printValue(original);//printing the array
        System.out.println("");
        
        
        //Third step
        //constructing for loop to copuy value
        for(int i = 0 ; i < original.length; i++ ){
            arr[i] = original[i]; //manually copying all the valued from original back to arr
        }//end for loop
        System.out.println("After (c) step 3 of expansion (copy original integers)");
        System.out.print("arr --> "); 
        printValue(arr);//printing the array
        System.out.print("original --> "); 
        printValue(original);//printing the array
        System.out.println("");
        
        
        //fourth step
        original = null;
        System.out.println("After (d)");
        System.out.print("arr --> "); 
        printValue(arr);//printing the array
        System.out.println("original --> "+ original); 
        System.out.println("");
       
        
        
    }//end main
    
    
    
   
    public static void printValue(int array []){
        
        // constructing for loop to print out the values
        for (int val = 0; val < array.length; val++ ){
            
            if (val == (array.length - 1)){
               System.out.println(array[val]);
            }
            else{
            System.out.print(array[val]+ ", ");
            }
        
        }//end for loop
        
    }//end printVlaue method
}//end ArrayExpansion
