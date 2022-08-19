package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date {
    public static void main(String[] args) {
        LocalDate dateObj=LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date=dateObj.format(formatter);
        System.out.println(date);
        String Value="{2020,07,15}";
        String s1=String.valueOf(Value);
        System.out.println(s1);

    }
}






