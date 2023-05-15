package reviewExercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Day17 {
    public static void main(String[] args) {
        //Type code to get the current date
        Date date=new Date();
        System.out.println("date = " + date);

        //Type code to get the current time in your local area
        LocalTime localTime=LocalTime.now();
        System.out.println("localTime = " + localTime);

        //Type code to get the current date in your local area
        LocalDate localDate=LocalDate.now();
        System.out.println("localDate = " + localDate);

        //Type code to get current date and current time in your local area
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        //How to get a specific component from date and time
        System.out.println(LocalDateTime.now().getMonth());
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDateTime.now().getYear());

        //How to get time in another time zone
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));

        //How to go future or past in date and time
        System.out.println(localTime.plusHours(3));

        //How to compare two dates
        LocalDate z=LocalDate.of(2000,8,27);
        LocalDate g=LocalDate.of(1991,6,12);
        boolean result=g.isBefore(z);

        //How to format Date
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(format.format(localDate));
        //How to format Time
        DateTimeFormatter timeFormat=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(timeFormat.format(localTime));
    }
}
