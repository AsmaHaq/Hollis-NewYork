package practicelecture4;

public class TestEncapsulation {
    public static void main(String args[]){
        Encapsulate Obj=new Encapsulate();
        // Setting values of the variables
        Obj.setName("Harsh");
        Obj.setAge(19);
        Obj.setRoll(51);

        //Displaying values of the variables
        System.out.println("Greek's name: " + Obj.getName());
        System.out.println("Geek's age: " + Obj.getAge());
        System.out.println("Geek's roll: " + Obj.getRoll());


        //Direct access of geekRoll is not possible
        //due to encapsulation
        //System.out.println(" Geek's : " + Obj.geekName);// needs to use get method.
    }
}

