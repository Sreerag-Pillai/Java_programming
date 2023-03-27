/************************************************************************
* Programmer:  Sreerag M Pillai
*
* Course:  CSCI 1471
*
* Date:  03, 26, 2023
*
* Assignment #7: GradeBook
*
* Environment:  Java with Netbeans IDE
*
* Files Included: GradeBookTest.java, GradeBook
*
* Purpose: The purpose of this code is to create a GradeBook class that processes student grades.
*
* Preconditions/Assumptions:
*          - The input is a two-dimensional array of student grades.
*
* Output:  The code prints the grade distribution, minimum, maximum, and average grades.
*
* Algorithm:
*          1. Create a class named GradeBook.
*          2. Define instance variables courseName and grades.
*          3. Create a constructor that takes a course name and a 2D array of grades.
*          4. Create methods to set and get the course name.
*          5. Create a method to display a welcome message.
*          6. Create a method to process grades.
*             a. Call the outputGrades method.
*             b. Call getMinimum and getMaximum methods.
*             c. Call the outputBarchart method.
*          7. Create a method to calculate the average of an array of grades.
*          8. Create a method to output grades.
*             a. Iterate through the 2D array and print each grade.
*             b. Print the average grade for each row.
*          9. Create methods to find the minimum and maximum grades.
*         10. Create a method to output a bar chart of the grade distribution.
*             a. Calculate the frequency of each grade range.
*             b. Print the frequency distribution as a bar chart.
*         11. End the GradeBook class.
************************************************************************/

package gradebook;

public class GradeBook
{
 private String courseName; // name of course this grade book represents
 private static int[][] grades; // two-dimensional array of student grades

 // two-argument constructor initializes courseName and grades array
 public GradeBook( String name, int[][] gradesArray )
 {
 courseName = name; // initialize courseName
 grades = gradesArray; // store grades
 } // end two-argument GradeBook constructor
 // method to set the course name
 
 
 public void setCourseName( String name )
 {
 courseName = name; // store the course name
 } // end method setCourseName
 // method to retrieve the course name
 
 
 public String getCourseName()
 {
 return courseName;
 } // end method getCourseName

 
 
 // display a welcome message to the GradeBook user
 public void displayMessage()
 {
 // getCourseName gets the name of the course
 System.out.printf( "Welcome to the grade book for\n%s!\n\n",
 getCourseName() );
 } // end method displayMessage
 
 // perform various operations on the data
 
 
 
 public void processGrades()
 {
 // output grades array
     
 outputGrades();
 // call methods getMinimum and getMaximum
 System.out.printf( "\n%s %d\n%s %d\n\n",
 "Lowest grade in the grade book is", getMinimum(),
 "Highest grade in the grade book is", getMaximum() );

 // output grade distribution chart of all grades on all tests
 outputBarchart();
 
 } // end method processGrades
 
 
 //method to calculate average
 public static double getAverage(int array[]){
     double average;
     double sum = 0;
     double count = 0;
     for(int val: array){
         sum += val;
         ++count;
     }//end of for loop to get values from arrays
     average = sum/count;
     return average;
 }//end of getAverage method
 
 
 
// // output the contents of the grades array
 public static void outputGrades(){
     int stuID = 0;
     int [] [] array = grades;
     System.out.printf("The grades are: \n\n");
     System.out.printf("%19s%8s%8s%10s", "Test 1", "Test 2", "Test 3", "Average");
     for(int [] row: array){
         double rowAverage = getAverage(row);  // determine average grade for particular student (or set of grades)
         ++stuID; 
         System.out.printf("\n%s %d","Student", stuID);
         for(int col: row){
             System.out.printf("%7d ", col);
             
             
         }//end for loop to access cloumns
         
         System.out.printf("%10.2f",rowAverage);
            
         }//end for loop to access rows
     System.out.println(" ");
 }//end of method output grades
 
 
 
 
 
 // find minimum grade
 public static int getMinimum(){
     int minimum = 100;
     
     for(int [] row: grades){
         for(int col: row){
             if (col < minimum ){
                 minimum = col;
             }//end if branch
         }//end for loop for col
     }//end for loop for rows
     return minimum;
 }//end getMinimum method
 
 
 
 // find maximum grade
  public static int getMaximum(){
     int maximum = 0;
     
     for(int [] row: grades){
         for(int col: row){
             if (col > maximum ){
                 maximum = col;
             }//end if branch
         }//end for loop for col
     }//end for loop for rows
     return maximum;
 }//end getMinimum method

 

 // output bar chart displaying overall grade distribution
public static void outputBarchart(){
     int [] frequency  = new int [11]; //creating a frequency array
     
     for (int []row : grades){
         for (int col : row){
             if (col/10 == 10){
                 ++frequency[10];
             }//end if branch for getting 100's
             else{
                int index = col/10;
                ++frequency[index];//incrementing frequency array to corresponding index
             }
         }//end for loop to access coloumns
     }//end for loop to accces rows
     
     //printing out barchart
     for (int index =0 ; index < frequency.length; index++){
         if (index == 10){
             System.out.printf("%5d:", 100);
         }//end of if branch printing 100
         else{
         System.out.printf("%2d-%2d:", index*10, index*10+ 9);
         }//end else branch
         
         for (int star = 0; star < frequency[index];star++ ){
             System.out.print("*");
         }//end of for loop that prints stars according to frequency
         System.out.println("\n");
     }//end for loop
     
    
}//end outputBarchart method


} // end class GradeBook
    
