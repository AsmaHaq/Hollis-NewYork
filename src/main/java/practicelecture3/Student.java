package practicelecture3;
// Static method in Java is a method which belongs to the class and not to the object.
// A static method can access only static data.
// It is a method which belongs to the class and not to the object(instance).
// A static method can access only static data. It cannot access non-static data (instance variables).
public class Student {

    int a;             // class -level variables
    static int b;

    public Student(){
        //Constructor incrementing static variable b
        b++;
    }
    public void showData(){
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " +b );
    }
    public static void Increment(){
        b++;
        //a++; // a does not static variables. you cant not use non static variables.
    }

}


