package pl.coderslab.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class MainDate01 {
    public static void main(String[] args) {


        //dzis
        LocalDate today = LocalDate.now();
        //ostatni dzien tego miesiaca
        LocalDate lastday = today.with(TemporalAdjusters.lastDayOfMonth());
        //nastepnyy piatek
        LocalDate nextfriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        //pierwszy dzien kolejnego
        LocalDate firstday = today.with(TemporalAdjusters.firstDayOfNextMonth());

        System.out.println(lastday);
        System.out.println(nextfriday);
        System.out.println(firstday);





    }
}
