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

import java.util.Scanner;

public class YourCarApp {

public static void main(String[] args) {
        
Scanner input = new Scanner( System.in);//creating input object
      
BuildCarApp car = new BuildCarApp();//building car object

int fuel;
System.out.print("How many gallons of gas in your tank (Integer 1-15)? ");
fuel = input.nextInt();//getting fuel input from user
car.fuel_guage(fuel);

float distance_possible;
distance_possible = fuel *20;
float t_dist;//calculate total distance
t_dist = 0;


System.out.print("Are you going on a trip (1 = Yes or 0 = No)? ");

int user_input;
user_input = input.nextInt();

int leg;
leg = 0;

while (user_input == 1)
{
    leg += 1;
    int speed;
    System.out.printf( "Enter Leg %d Speed (MPH Integer): ",leg ); 
    speed = input.nextInt();//getting speed from user

    float distance;   
    System.out.printf( "Enter Leg %d Distance (miles): ", leg ); 
    distance = input.nextInt();// getting distance from the user
    
    t_dist += distance; //incrementing toal distance
    
    if ( distance_possible - t_dist >= 0)
    {
        car.total_miles(distance);//incrementing total miles
        car.time(speed, distance);//calculating time and increment that time to total time
    
        System.out.print("Are you going on a trip (1 = Yes or 0 = No)? ");
        user_input = input.nextInt();
        System.out.println("\n");
    }
    else
    {
        t_dist = t_dist -distance;//subtracting last added distance from total distance
        System.out.printf("you do not have enough gas to cover entire trip.\nMiles left is %.2f\n", distance_possible - t_dist);
        System.out.printf("Would you like to restart the trip (1 = Yes or 0 = No)? ");
        user_input = input.nextInt();
        leg = leg - 1;
        System.out.println("\n");
        
    }
}

car.time_check();// calculating total distance and time took

car.check_fuel();//method to determine if there is enough gas left for the return trip

    }//end main method
    
}//end class
