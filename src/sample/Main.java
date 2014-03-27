package sample;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
	    ZoneId localZone = ZoneId.systemDefault();
        System.out.println(localZone);

        ZonedDateTime aeg = ZonedDateTime.of(2014, 3, 30, 3, 30, 0, 0, localZone);
        System.out.println(aeg);
    }
}
