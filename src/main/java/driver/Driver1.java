package driver;

import practicelecture4.Sum;

public class Driver1 {
    public static void main (String args []){

        Sum s=new Sum();
        System.out.println(s.summation(10,20));
        System.out.println(s.summation(10,20,30));
        System.out.println(s.summation(10.5,20.5));



    }
}
