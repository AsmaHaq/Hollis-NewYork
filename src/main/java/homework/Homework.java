package homework;

import java.util.Arrays;

public class Homework {
    static int[] arrayMiddle(int[] nums) {
        int[] a;
        a = new int[2];
        a[0] = nums[(nums.length / 2) - 1];
        a[1] = nums[nums.length / 2];
        System.out.println("New Array: " + Arrays.toString(arrayMiddle(a)));
        return a;
    }

    }









