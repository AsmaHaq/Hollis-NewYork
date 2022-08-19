package practicelecture3;

public class Driver8 {
    public static void main(String args[]){
        //String str ="WEDNESDAY";    // default statement
        //EnumTest test1=new EnumTest(Day.valueOf(str));
        //test1.dayIsLike();

        String tsr2 ="SUNDAY"; // day statement
        EnumTest test2=new EnumTest(Day.valueOf(tsr2));
        test2.dayIsLike();

        //String tsr3 ="aaaa"; //Exception thread // error
        //EnumTest test3=new EnumTest(Day.valueOf(tsr3));
        //test3.dayIsLike();
    }
}
