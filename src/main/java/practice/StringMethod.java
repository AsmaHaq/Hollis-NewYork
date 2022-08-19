package practice;

import java.util.Locale;

public class StringMethod {

    public static void main(String[] args) {
        String name="Harry";
        //System.out.println("My name is:" +"Harry");//0,1,2,3,4 H.a.r.r.y
        // length of string
        int value =name.length();
        System.out.println(value);

        //String convert in lowercase
       // String lstring =name.toLowerCase();
        //System.out.println(lstring);

        //String convert upper case.
       // String ustring = name.toUpperCase();
       // System.out.println(ustring);
        //trim with space
       // String nonTrimmedString= "        Harry      ";
       // System.out.println(nonTrimmedString);
        // trim string no space
      //  String trimmeedString=nonTrimmedString.trim();
       // System.out.println(trimmeedString);

        //name.substring(int Start)Return substring from short to the end substring(3)
        //returns "ry"[note that index starts from 0]
        System.out.println(name.substring(3));


   // name.substring(int start,int end) Returns a substring from start index to the end index.Start index to the end
    // index.Start index to the end index is included and end is excluded.
        System.out.println(name.substring(1,4));

    //name.replace('r','p') Returns a new string after replacing r with p.Happy is return in this case.
        System.out.println(name.replace('r', 'p'));

        System.out.println(name.replace("r","ier"));
        // string boolean return
        //System.out.println(name.startsWith("Har"));

       // System.out.println(name.startsWith("prr"));

      // name.CharAt return charecter at given index position , r in this case.
       // System.out.println(name.charAt(4));

      //  System.out.println(name.indexOf("ry"));
        String modified = "Harryrry";
        System.out.println(modified.indexOf ("rry"));
        System.out.println(name.indexOf("rry",4));

        System.out.println(name.contains("Har"));

    }


}