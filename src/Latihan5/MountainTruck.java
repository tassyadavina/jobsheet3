/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class MountainTruck extends Truck 
{
    //the MountainTruck subclass addds one field 
    public int seatHeight;

    //the MountainTruck subclass has one contructor
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    
    // the mountainruck subclass adds one method
    public void setHeight(int newValue) 
    {
        seatHeight = newValue;
    }
    public static void main (String [] aku)
    {
        System.out.println("mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear  = "+ MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear  = "+ MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedUp(2);
        System.out.println("gear  = "+ MB.gear);
        System.out.println("speed = "+MB.speed);
    }
}
