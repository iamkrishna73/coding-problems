package com.codewithme;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class Java8Tester {
    public static void main(String [] args){
            Java8Tester java8tester = new Java8Tester();
            java8tester.testLocalDateTime();
    }
        public void testLocalDateTime() {
            LocalDateTime currentTime = LocalDateTime.now();
            System.out.println("Current Date Time: " + currentTime);

            LocalDate date1 = currentTime.toLocalDate();
            System.out.println("date1: "+ date1);

            Month month = currentTime.getMonth();
            int day = currentTime.getDayOfMonth();
            int second = currentTime.getSecond();

            System.out.println("Month: " + month + " day: " + day + " Second: " + second);

            LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
            System.out.println("date2: " +  date2);

            LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
            System.out.println("date3: " + date3);

            LocalTime date4 = LocalTime.of(12, 15);
            System.out.println("date4: " + date4);

            LocalTime date5 = LocalTime.parse("20:15:30");
            System.out.println("date5: " + date5);

       }
}
