package practicelecture4;

                                   //Polymorphism. in java
    //overloading in java// Under the same class,various method with the same name present in a class
     //Differentiated by the number,order and types of their parameters.

public class Sum {
    //Overloaded Method called summation().This summation takes two int value to sum
    public int summation(int x,int y){  // two int data type parameters

        return (x + y);
    }
    //Overload summation(). This summation  takes three int value to sum
    public int summation(int x,int y, int z){  // Three int data type parameters
        return (x+y+z);
    }
    //overloaded summation(). This summation takes two double  values to sum
    public double summation(double x,double y){  // two double type parameters
        return (x+y);

    }

    }




