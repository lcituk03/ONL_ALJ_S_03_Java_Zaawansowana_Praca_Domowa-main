package pl.coderslab.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main02 {

    public static void main(String[] args) {
        //tu mamy zaimplementowac filtry i sprawdzic
        Predicate<String> morethan4 = n -> n.length()>4;
        Predicate<String> containsb = n -> n.contains("b");
        Predicate<String> endswitha = n -> n.endsWith("a");

        List<String> list = Arrays.asList("tree", "bird", "park", "snow",
                "computer", "i jeszcze jakiś inny napis, który na końcu ma a");

        System.out.println(filterList(list, morethan4));
        System.out.println("----------");
        System.out.println(filterList(list, containsb));
        System.out.println("----------");
        System.out.println(filterList(list, endswitha));



    }
    //tu mamy napisac metode implementujaca Predicate

    public static List<String> filterList(List<String> list, Predicate<String> filter ){
        List<String> filteredList = new ArrayList<>();
        for(String s : list){
            if (filter.test(s)){
                filteredList.add(s);
            }
        }
        return filteredList;
    }
}
