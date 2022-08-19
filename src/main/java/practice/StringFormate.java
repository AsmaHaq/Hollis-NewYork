package practice;

public class StringFormate {
    public static void main (String [] args) {
        String name ="Jonathan";
        int age= 20;
        int salary=4000;
        //System.out.println("My name is: "+name+
        // "and i am "+age +
        //"years old and my salary is $" +salary
        //  +    "yearly");
        //with the help of String.format
        String s= String.format("My name is %s i am %d year old and my salary is $%d yearly",name,age,salary);
        System.out.println(s);
     }
}
