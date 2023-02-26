/************************************************************************ 
* Programmer:  Sreerag M Pillai
* 
* Course:  CSCI 1471 
* 
* Date:  02, 25,2023
* 
* Assignment #6:  CalcArea
* 
* Environment:  Java with Netbeans IDE
* 
* Files Included: CalcArea and TotalArea
* 
* Purpose:  To calculate the area of three different shapes with different combination of dimension.  
* 
* Preconditions/Assumptions:  
* 
* Output:  area (double), totalArea(double)
* 
* Algorithm: 
*           Declare instance variables needed
*           Construct getRecArea method to calculate the area of a rectangle which will take in two parameters.
*           Construct getCirArea method to calculate the area of a circle which will take in one parameter.
*           Construct getTriArea method to calculate the area of a triangle which will take in two parameters
***********************************************************************/ 
public class CalcArea {
    

    
    public static double getRecArea(double l, double b, double n){
        
        double RecArea = l * b*n;
        return RecArea;
    }
    
    public static double getCirArea(double r, double n){
        
        double CirArea = (Math.pow(r, 2.0 ))* (Math.PI)*n;
        return CirArea;
    }    
            
    public static double getTriArea(double h, double b, double n){
        
        double TriArea = 0.5*h * b *n;
        return TriArea;
    }
    
    
}
