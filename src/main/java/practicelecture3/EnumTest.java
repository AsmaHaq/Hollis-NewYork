package practicelecture3;
import java.util.Scanner;
public class EnumTest {  // An Enum class
    Day day;
    public EnumTest(Day day){  // Constructor
        this.day= day;

    }
    public void dayIsLike(){
      // print a line about day using Switch
        switch (day){
            case MONDAY:
                System.out.println("Monday are bad");
                break;
            case FRIDAY:
                System.out.println("Friday are better");
                break;
            case SUNDAY:
                System.out.println("Weekend are best");
                break;
            default:
                System.out.println("Weekday are so so");
                break;

        }
    }
}
