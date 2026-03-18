package pl.coderslab.dates;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class MainDate03 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate before = LocalDate.of(2003, Month.FEBRUARY,7);
        System.out.println(younger(now,before));
        
    }

    public static boolean younger(LocalDate date1, LocalDate date2){
        return date1.isAfter(date2);
    }

    public static  boolean younger2(Date date1, Date date2){
        return date1.after(date2);
    }
}
