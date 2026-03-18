package pl.coderslab.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main02 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2003, Month.FEBRUARY, 7);
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthday,now);

        // w latach
        System.out.println(period.getYears());



        //w miesiacach
        System.out.println(period.toTotalMonths());

        //w dniach
        System.out.println(ChronoUnit.DAYS.between(birthday, now));

    }
}
