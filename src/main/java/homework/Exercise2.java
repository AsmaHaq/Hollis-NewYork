package homework;

// Sum of the Array
public class Exercise2 {
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 7,9,8};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}

