package practicelecture4;

//inheritance:
// This is the base class or parent class or super class.
public class Bicycle {
//The Bicycle class has two variables//fields/attributes.
    public int gear;
    public int speed;

    //The Bicycle has one constructor.
    public Bicycle(int gear,int speed){
    this.gear= gear;
    this.speed=speed;

    }
    //The Bicycle class has this method to reduce the speed
    public void applyBreak(int decrement){
        speed -= decrement; //speed = speed -decrement.
    }
    //The Bicycle has this method  to increase the speed.
    public void speedup(int increment){
        speed+= increment; //speed=speed + increment
    }
    //The Bicycle class has this method to print the bicycle information
     public String printInfo(){
        return (" No of gears are "    + gear  +   "  speed of bicycle is " + speed);
     }

}
