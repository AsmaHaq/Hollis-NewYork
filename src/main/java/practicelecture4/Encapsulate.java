package practicelecture4;
//
///private variables declared
//these can only be accessed b
//public methods of class

   public class Encapsulate {
        private String geekName;
         private int geekRoll;
         private int geekAge;

    //get method for age to access// read-only
    //private variable geekAge
    public int getAge(){
        return geekAge;
    }
   //get method for name to access
    // private variables geekRoll

       public String getName(){
        return geekName;
       }

       //get method for Roll to access
       //private variable geekRoll
    public int getRoll() {
        return geekRoll;
    }
    //Set method-write only.
    //set method for age to access
    //private variable geekAge
    public void setAge(int newAge){
        geekAge=newAge;
    }
       //set method for name to access
       //private variables geekName
       public void setName(String newName) {
           geekName = newName;

       }

       //set method for roll to access
       //private variable geekRoll
       public  void setRoll(int newRoll){
        geekRoll=newRoll;
       }
   }



