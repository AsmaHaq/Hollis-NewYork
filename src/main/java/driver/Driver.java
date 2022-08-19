package driver;

import practicelecture4.MountainBike;

public class Driver {
    public static void main(String args[]){
        MountainBike mb=new MountainBike( 3, 100, 25);
        System.out.println("Original value -> "+  mb.printInfo());
        mb.applyBreak(25);
        System.out.println("Decreasing the speed->  " +  mb.printInfo());
        mb.speedup(50);
        System.out.println("Increasing the speed-> " +mb.printInfo());
        mb.setSeatHeight( 35);
        System.out.println("Increasing the seat height ->  " +  mb.printInfo());




    }
}
