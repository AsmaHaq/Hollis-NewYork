package practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
// Homework problem 3
public class RandomNum {
    public static void main(String[] args){
        Random random=new Random();
        List<Integer>  list=new ArrayList<>();
        int max=0;
        for(int i= 0; i<5; i++){
            list.add(random.nextInt(15));
            max=list.get(0);
            if(list.get(i) >max){
                max=list.get(i);
            }
             System.out.println(list.toString());
            System.out.println("Min element: " + max);
            Object[]convertArr= list.toArray();
            Arrays.sort(convertArr);
            System.out.println("Min element: " +convertArr[0]);
        }

    }


    }


