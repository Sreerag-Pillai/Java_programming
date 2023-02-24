/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  02, 22,2023
* 
* Assignment #3:  program 3: ModifiedYourCarApp
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: MOdifiedBuildCarApp and ModifiedYourCarApp
* 
* Purpose:  To a car on a trip and print out different aspects about the trip using a for loop .  
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
package homework5;

import java.util.Scanner;

public class ModifiedYourCarApp {

public static void main(String[] args) {
        
Scanner input = new Scanner( System.in);//creating input object
      
ModifiedBuildCarApp car = new ModifiedBuildCarApp();//building car object

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
System.out.print("How many legs would you like to go? ");
leg = input.nextInt();


for (int i = leg; i>0; i--)
{
   
    int speed;
    System.out.printf( "Enter Leg Speed (MPH Integer): " ); 
    speed = input.nextInt();//getting speed from user

    float distance;   
    System.out.printf( "Enter Leg Distance (miles): " ); 
    distance = input.nextInt();// getting distance from the user
    
  
    
    t_dist += distance; //incrementing toal distance
    
    if ( distance_possible - t_dist >= 0)
    {
        car.total_miles(distance);//incrementing total miles
        car.time(speed, distance);//calculating time and increment that time to total time
    

    }
    else
    {
        t_dist = t_dist -distance;//subtracting last added distance from total distance
        System.out.printf("you do not have enough gas to cover entire trip.\nMiles left is %.2f\n", distance_possible - t_dist);
        
        System.out.println("\n");
        
    }
}

car.fuel_used();
car.time_check();// calculating total distance and time took

car.check_fuel();//method to determine if there is enough gas left for the return trip

    }//end main method
    
}//end class
