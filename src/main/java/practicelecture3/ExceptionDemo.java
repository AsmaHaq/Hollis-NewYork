package practicelecture3;

public class ExceptionDemo {

    public void testException() {
        //int num []= {1,2,3,4};   // [Throwing an error.Exception in thread "main"
        //System.out.println(num[5]);// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]

        // handle the Exception with try{ catch key word
        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);
        } catch (Exception e) {
            System.out.println(e);
         System.out.println("You program has issues. Fix it");
        }

    }
}