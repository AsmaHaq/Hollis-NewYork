package driver;

import practicelecture4.Child;
import practicelecture4.Parent;

public class Driver2 {

        public static void main(String args[]){
            //If a Parent type reference refers to  a parent objects,then parent's
            //show is called
            Parent Obj1=new Parent();
            Obj1.show();

            //If a parent type reference refers to a child object Child's Show()
            //is called.This is called Run Time polymorphism.
            Parent Obj2=new Child();
            Obj2.show();



        }

        }


