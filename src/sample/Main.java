package sample;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
	    TimeZone localZone = TimeZone.getDefault();
        System.out.println(localZone);

        GregorianCalendar calendar = new GregorianCalendar(localZone);
        calendar.set(2014, Calendar.MARCH, 30, 3, 30);
        System.out.println(calendar.getTime());
    }
}
