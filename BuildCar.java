/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  02, 07,2023
* 
* Assignment #3:  Car_app
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: BuildCar and MyCarApp
* 
* Purpose:  To take two cars on two different trip and print out different aspect about each cars trip.  
* 
* Preconditions/Assumptions:  Car is stopped and all the variables have a value of zero
* 
* Output:  Status of the car at the beginning of trip, Every events of the trip, and status of the car at the end of the trip
* 
* Algorithm: 
*      Declaring essential variable needed for the car
*      Constructing methods to alter the variable
*      Output the status of the car after or before the trip
*          
***********************************************************************/ 

package mycarapp;

public class BuildCar {
    // decalring instance variables
    private int speed = 0; 
    private int odometer = 0;
    private int direction;
    private float fuel_guage = 0;
    private int leg = 0 ;
    
    
    public void hit_gas(int increment)//to increase speed
    {
        speed = speed+ increment;
        System.out.println("Speed increased by " + increment);
    }
    
    public void hit_break(int decrement) // to decrease speed
    {
        speed = speed - decrement;
        System.out.println("Speed decreased by " + decrement);
    }
    
    public void turn_right(int degree) //to take a turn
    {

        direction = direction + degree;
        System.out.println("Just turned right " + degree);
        leg = leg + 1;
        
    }
    
    public void turn_left(int degree) //to take a turn
    {
        direction = direction - degree;
        System.out.println("Just turned left " + degree);
        leg = leg + 1;
    }
    
    public void add_miles(int increment) // to add miles to odometer
    {
        odometer = odometer + increment;
        System.out.println("I added " + increment +" more miles to the trip");
    }
    
   
    public void add_fuel(int increment) // to add fuel to fuel guage
    {
        fuel_guage = fuel_guage + increment;
        System.out.println("Just added " + increment +" more gallons of fuel");           
    }
    
    
     public int check_miles() // checking total miles
    {
        return odometer;
    }
    
     //declaring a variable called fuel_used
     public float fuel_used;
     
    public void check_fuel() //to calculate fuel left and fuel used
    {
        float fuel_left =   fuel_guage - ( odometer/20) ;//creating equation for amount of fuel used
        fuel_used =  fuel_guage - fuel_left ;//Calculating fuel used
        System.out.printf("Current fuel level %.2f", fuel_left);
    }
    
    public float fuel_used() // returnign fuel used by the car
    {
        return fuel_used;
    }
    
    public int return_leg() // returning number of legs car took
    {
        return leg;
    }
    
    public void status() // returnig the status of the car
    {
        System.out.printf("Speed = %d\nFuel = %f\nDirection = %d\nOdometer = %d\n", 
                speed, fuel_used, direction, odometer  );
    }
}