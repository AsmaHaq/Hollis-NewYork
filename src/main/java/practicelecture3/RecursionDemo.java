package practicelecture3;


import static java.lang.Long.sum;

//
public class RecursionDemo {

    //Sum of 1-10
    //Sum= 10+9+8+7+6+5+4+3+2+1
    //Sum=10+Sum(1-9) // Breaking down number highest to lower -backward all the way to the 0 and then forward.
    //Sum=10+9 +Sum(1-8)
    //Sum =10+8 +Sum(1-7)

    public static void main (String args[]){
        int result = sum(100);
        System.out.println(result);


    }
     public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        } else{
            return 0;
        }


     }


    }


