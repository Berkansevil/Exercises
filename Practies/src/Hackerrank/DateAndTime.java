package Hackerrank;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        String dateString="2020-04-08 12:30";
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:");
        LocalDateTime parsedTime=LocalDateTime.parse(dateString,formatter);
        System.out.println(parsedTime);
    }
}
