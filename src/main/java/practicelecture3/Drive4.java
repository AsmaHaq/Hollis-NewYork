package practicelecture3;

public class Drive4 {
    public static void main(String args[]) {
        MyClass myObj=new MyClass(); //Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x);// print the value of x

       MyClass yourClass=new MyClass(9); // one parameter under the constructor class
       System.out.println(yourClass.x);

       MyClass hisClass=new MyClass(9,5);// two parameter under the constrictor class
        System.out.println(hisClass.x);
    }
}
