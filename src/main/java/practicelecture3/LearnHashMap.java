package practicelecture3;
// HashMap is a Map based collection class that is used for storing  Key & value as pairs
//it doesn't sort stored Key and values orderly, it stores randomly. you must need to import java.util.Hasmap or its super
//class in order to use it.
//What is key and value: ex.Student Profile:
// Name: Asma Haque
//Occupation: QA tester
//City: New York.
// so the Question  what is your name?----refers to  Key
//Ans is Asma Haque is ----refers to Value.
//java Hashmap class stored both as a Pair Key Q.name and value Ans.together.
//HashMap<k,V>


import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    //create objets
    HashMap<String,String> hmap=new HashMap<>();
    // create method to insert the value.
    public void addHashMapValue(){
        //Adding values
        hmap.put("IE" , "Internet Explorer");
        hmap.put("Chrome", "Chrome Browser");
        hmap.put("Firefox", "Mozilla");
        hmap.put("Safari" , "Macbook");
        hmap.put("Opera" ,"Linux Browser");

        // to print or display method we use  System.out.println

        System.out.println("Browser name:" +hmap.get("Safari"));


        //to get all the key and Values together we have to use loop method--EachLoop.
        //use special class name Map.Entry() to get entire key & value.
        //use special method name hmap.entrySet()

        for(Map.Entry map: hmap.entrySet()){
            System.out.println(map.getKey()+"  " +map.getValue());
        }

       // for(Map.Entry map: hmap.entrySet());
        //how do we print all the key and values." "--for space

    }


}
