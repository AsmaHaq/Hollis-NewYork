package practice;

public class Variables1 {
    //Local scope: within the method.
    public void intVariables(){
        int salary = 1000;
                System.out.println("My Salary is: " + salary);
    }
    //Global scope: Outside od the method.Available to all the methods.
    int salary = 2000;
    public void adamSalary() {

        System.out.println("My Salary is: " + "adam" + salary);
    }
     public void  davidSalary() {
        System.out.println("My Salary is : " +"david" + salary);

    }
}
