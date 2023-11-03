package week_09.assignment.Question_09_05;

import java.sql.SQLOutput;
import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Current year:" + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month:" + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day:" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();

        System.out.println("After setTime:");
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Current year:" + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month:" + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Current day:" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
