package practice;
//sorting elements in descending order.

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DescOrder {
    public void sortArrayInDescendingOrder(){
        String[] States = {"California", "Florida", "Georgia", "Indiana", "Taxes"};
        Arrays.sort(States, Collections.reverseOrder());
        //print elements without loop
        System.out.println(Arrays.toString(States));

    }
}
