package practicelecture3;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;


public class Driver2 {
    public static void main(String args []){
        HashMap<String, Integer> map = new HashMap<>();
        //Add elements to the map
        map.put("vishal", 10);
        map.put("Sachin", 30);
        map.put("vaibhav", 20);

//print size and content
        System.out.println("Size of map is:-" + map.size());
        System.out.println(map);
//Check if a key is present and if
        //present,print value
        if (map.containsKey("vishal")) {
            Integer a = map.get("vishal");
            System.out.println("value for key" + " \"vishal\"is:" + a);

        }

    }
}







