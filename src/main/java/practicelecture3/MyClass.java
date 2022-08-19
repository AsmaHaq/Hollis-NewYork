package practicelecture3;
//Constructors: used to initialize objects.constructor is called when an object of a class is created

//Create MyClass
public class MyClass {
    int x;    //Create a class attributes



    //Create a class constructor for the MyClass class.
    public MyClass(){
        x=5;//set the initial value for the class attributes x

    }
    // add parameter
    public MyClass(int y){
        x=y;

    }
     public MyClass(int a, int b){
        x=a+b;

     }
}
// you could add as many as parameter you want.
// constructor only initialize value
//no returns
// as manu as constructor only change parameter under same name class constructor.




