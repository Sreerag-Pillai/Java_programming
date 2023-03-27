/************************************************************************
* Programmer:  Sreerag M Pillai
*
* Course:  CSCI 1471
*
* Date:  03, 26, 2023
*
* Assignment #6: GradeBook
*
* Environment:  Java with Netbeans IDE
*
* Files Included: GradeBookTest.java, GradeBook
*
* Purpose: The purpose of this code is to test the GradeBook class by processing student grades
*          and displaying the grade statistics.
*
* Preconditions/Assumptions:
*          - The input should be a two-dimensional array of student grades.
*          - A GradeBook class should be available with methods for processing grades and displaying messages.
*
* Output:  The code displays the course title, grade statistics, and a bar chart of grade distribution.
*
* Algorithm:
*          1. Create a class named GradeBookTest.
*          2. Define the main() method.
*             a. Initialize a two-dimensional array of student grades (gradesArray).
*             b. Create a GradeBook object (myGradeBook) with a course title and the gradesArray.
*             c. Call the displayMessage() method of the myGradeBook object.
*             d. Call the processGrades() method of the myGradeBook object.
*          3. End the main() method.
*          4. End the GradeBookTest class.
***********************************************************************************/

package gradebook;

public class GradeBookTest
{
 // main method begins program execution
 public static void main( String[] args )
 {
 // two-dimensional array of student grades
 int[][] gradesArray ={ { 87, 100, 70 }, { 78, 87, 78 }, { 94, 100, 90 },  { 100, 81, 82 }, { 83, 65, 85 }, { 78, 87, 65 }, { 85, 75, 83 }, { 91, 94, 100 },{ 100, 81, 100}, { 6, 65, 85 }, { 78, 87, 55 }, { 85, 75, 83 }, { 91, 94, 100 }, { 76, 72, 84 }, { 100, 93, 100 } };

 GradeBook myGradeBook = new GradeBook(
 "CSCI_1471 Copmuter ScienceII ", gradesArray );
 myGradeBook.displayMessage();
 myGradeBook.processGrades();
 } // end main
} // end class GradeBookTest