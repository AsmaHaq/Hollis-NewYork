package practice;

import java.util.Random;

public class Random1Lec {
    public static void main(String[] args) {
        //Create instance of Random class
        Random rand=new Random();
        //Generate random integers in range 0 to 999
        int rand_int1= rand.nextInt(1000);
          int rand_int2=rand.nextInt(1000);
        //print random integers
        System.out.println("Random Integers:" +rand_int1);
        System.out.println("Random Integers:" +rand_int2);

        // Random doubles
        double rand_dub1= rand.nextDouble();
        double rand_dub2= rand.nextDouble();
        //print random double.
       // System.out.print("Random Doubles: " +rand_dub1 );
        //System.out.println("Random Integers:" +rand_dub2);

    }
}