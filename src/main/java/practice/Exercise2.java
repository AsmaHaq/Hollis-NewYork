package practice;

public class Exercise2 {
    public static void main(String[] args) {
        //int[] marks={1,2,3,5};
        // marks[3]=34;
        // System.out.println(marks[2]);
        //System.out.println(marks[3]);
        // int[] FirstElement = {7, 9, 8};
        // for (int i = 0; i < FirstElement.length; i++) {
        //   System.out.println(FirstElement[i]);

        int[] [] FirstElement = {{1,2,3},{7, 9, 8}};
        for (int i=0;i< FirstElement.length;i++)
            for (int j=0;j< FirstElement.length;j++){
                //System.out.println(FirstElement[i][j]+ "");
                System.out.println(FirstElement[0][1]);


            }
    }
}
