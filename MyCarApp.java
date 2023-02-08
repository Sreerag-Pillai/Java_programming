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
* Output:  Status of the car at the begining of trip, Every events of the trip, and status of the car at the end of the trip
* 
* Algorithm: 
*      Creating two car objects of BuildCar class
*      Executing a series of method calls to take both cars on separate trips
*      Output the status of the car after or before the trip
*          
***********************************************************************/ 
package mycarapp;

/**
 *
 * @author manga
 */
public class MyCarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating two objects named tesla and lucid under class BuildCar
        BuildCar tesla = new BuildCar();
        BuildCar lucid = new BuildCar();
        
        System.out.println("Tesla's Status at Start ");
        tesla.status(); //printing status at start
        System.out.println();
        System.out.println();
        
        
        //Calling methods on objects to take tesla on a trip
        
        tesla.add_fuel(25);
        tesla.hit_gas(40);
        tesla.add_miles(40);
        System.out.println();
        //new leg
        tesla.turn_right(90);
        tesla.hit_gas(30);
        tesla.add_miles(40);
        tesla.hit_break(10);
        tesla.add_miles(60);
        tesla.check_fuel();
        System.out.println();
        //new leg
        tesla.turn_left(90);
        tesla.hit_gas(60);
        tesla.add_miles(60);
        tesla.check_fuel();
        tesla.hit_gas(10);
        tesla.add_miles(20);
        tesla.check_fuel();//end of trip
        
        System.out.println();
        System.out.println();
        
        //printing end of trip status
        System.out.println("Tesla's Status at Finish ");
        tesla.status();  
        System.out.printf("Number of legs %d\n", tesla.return_leg());
        System.out.printf("Tesla traveled %d and used %.2f gallons of fuel\n",tesla.check_miles(),tesla.fuel_used());
       
        
        System.out.println();
        System.out.println("********************************************************************************");
        System.out.println();
        
        
        System.out.println("Lucid's Status at Start ");
        lucid.status(); //printing status at start
        System.out.println();
        System.out.println();
        
        
        //Calling methods on objects to take lucid on a trip
        
        lucid.add_fuel(20);
        lucid.hit_gas(50);
        lucid.add_miles(20);
        System.out.println();
        //new leg
        lucid.turn_right(90);
        lucid.hit_break(10);
        lucid.add_miles(60);
        lucid.hit_gas(10);
        lucid.add_miles(80);
        lucid.check_fuel();
        
        System.out.println();
        //new leg
        lucid.turn_right(90);
        lucid.hit_gas(80);
        lucid.add_miles(20);
        lucid.check_fuel();
        lucid.hit_gas(60);
        lucid.add_miles(80);
        lucid.check_fuel();//end of trip
        System.out.println();
        System.out.println();
        //printing end of trip status
        System.out.println("Lucid's Status at Finish ");
        lucid.status();
        System.out.printf("Number of legs %d\n", lucid.return_leg());
  
        System.out.printf("Lucid traveled %d and used %.2f gallons of fuel\n",lucid.check_miles(),lucid.fuel_used());
       
        
    }
    
}
