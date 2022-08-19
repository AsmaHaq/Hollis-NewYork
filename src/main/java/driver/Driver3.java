package driver;

import practicelecture4.Pig;

public class Driver3 {
    public static void main(String args[]){

        //Animal myObj=new Animal(); ---> will generate an error//abstract class cannot be used to create
        //objects---to access it, must be inherited from another subClass.

        Pig pigObj=new Pig();
        pigObj.animalSound();
        pigObj.sleep();

            }
        }



