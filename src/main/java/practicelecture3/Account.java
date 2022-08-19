package practicelecture3;
//Key word "This" is a reference variables to remove confusion from class attributes and parameters.

//[this keyword in Java is a reference variable that refers to the current object of a method or a constructor.
// The main purpose of using this keyword in Java is to remove the confusion between class attributes and parameters]

//Main method: where we create an object for Account class and call methods set data and show data.

public class Account {    //Class: class Account

    int a; //[ Instance Variable: a and b]// Class level variables "a" and "b"
    int b;

    public void setData(int a, int b) {  // parameter "b"       //[Method Set data: To set the value for a and b.]
      //  a = a;// java takes the value of parameter "a", and assigns the value to the parameter a.
       // b = b;
        this.a=a; // to correct the error inside the setData method use reference variables "this" key word
        this.b=b;

        }
    public void ShowData () {            // Method Show data: To display the values for a and b.
        System.out.println("Value of  A= " + a);
        System.out.print("Value of B = " + b);//Class Level variables

    }
// it will show value A=0 , B= 0

    }


