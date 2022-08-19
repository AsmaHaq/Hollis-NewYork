package practice;

public class Array {
    public static Object sort;

    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];// length of array is 5.1,2,3,4,5. index of int data 0,1,2,3,4(same int datatype with collection of multiple values.)
        arr[0] = 40;
        arr[1] = 50;
        arr[2] = 60;
        arr[3] = 70;
        arr[4] = 80;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elements at index" + "is" +arr[i]);

        }
    }
}




