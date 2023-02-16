/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  02, 14,2023
* 
* Assignment #3:  program 3: YourCarApp
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: BuildCarApp and YourCarApp
* 
* Purpose:  To a car on a trip and print out different aspects about the trip using a while loop with a sentinel.  
* 
* Preconditions/Assumptions:  Car is stopped and all the variables have a value of zero
* 
* Output:  Let the user know when they do not have enough gas through out the trip and miles left,
*          
* 
* Algorithm: 
*      Declaring essential variable needed for the car
*      Constructing methods to alter the variable
*      Output the status of the car after or before the trip
*          
***********************************************************************/ 
package yourcarapp;

public class BuildCarApp {
 // declaring needed instance variables  
 private float time =0;
 private float fuel_guage =0;
 public float total_time =0;
 private float total_miles = 0;
 
 public void total_miles(float input) //method to increment total miles
 {
     total_miles += input;
 }
 
 /*public void speed(int input)
 {
     speed = input;
 }
 */
 
 public void fuel_guage(int input) //method to add user inputted fuel
 {
     fuel_guage += input;
 }
 
 public float fuel_used;//constructing a viariable called fuel_used
 
 public void check_fuel() //method calcualte fuel left and fuel used at the end and determine if there is enough gas for return trip
 {
        float fuel_left =   fuel_guage - ( total_miles/20) ;//creating equation for amount of fuel used
        fuel_used =  fuel_guage - fuel_left ;//Calculating fuel used 
        if (fuel_used <= fuel_left)
        {
            System.out.println("you have enough gas for the return trip");
        }
        else
        {
            System.out.println("your car will need more gas for the return trip");
        }
            
 }
 
 public void time(int speed, float distance) //method to calculate time from distance and speed and incremen that time to total_time
 {
    time = distance/speed;  
    total_time += time;
 }
 
 public void time_check() //print total time and total distance traveled by the car at the end of the trip
 {
     total_time = total_time * 60; //converting hour to minutes
     System.out.printf("You traveled about %.2f miles in about %.2f minutes. \n",total_miles, total_time );
 }
 
}
