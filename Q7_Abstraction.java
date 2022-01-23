/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
// Name:-Dona Upadhyay
 abstract class Vehicle
{    
    abstract int getSpeed();    
}    
class Bike extends Vehicle
{    
    int getSpeed()
   {
        return 20;
   }    
}    
class Car extends Vehicle
{    
     int getSpeed()
     {
        return 50;
     }    
}    
public class Q7_Abstraction
{    
    public static void main(String args[])
   {    
       Vehicle bike = new Bike();
       Vehicle car = new Car();
       int bikespeed = bike.getSpeed();    
       int carspeed = car.getSpeed();
       System.out.println("Speed of Bike is: "+bikespeed+" Km/h");
       System.out.println("Speed of Car is: "+carspeed+" Km/h");
    }
}
