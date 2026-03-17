package pl.coderslab.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main04 {

    //spr czy dziala
    public static void main(String[] args) {
        List<String> words = Arrays.asList("kot", "pies", "samochód", "dom", "okno");

        // search
        List<String> longerThan3 = search(words, s -> s.length() > 3);
        System.out.println("search - dluzsze niz 3:");
        System.out.println(longerThan3);

        // changeCollection
        List<Integer> lengths = changeCollection(words, s -> s.length());
        System.out.println("changeCollection - dlugosci napisow:");
        System.out.println(lengths);

        // consumeCollection
        System.out.println("consumeCollection - wypisanie duzymi literami:");
        consumeCollection(words, s -> System.out.println(s.toUpperCase()));
    }

    public static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {
        List<T> resultList = new ArrayList<>();
        for (T t : collection) {
            if (predicate.test(t)) {
                resultList.add(t);
            }
        }
        return resultList;

    }

    public static <T, S> List<S> changeCollection(Collection<T> collection, Function<T, S> function) {
        return collection.stream().map(function).collect(Collectors.toList());
    }

    public static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer) {
        collection.forEach(consumer);
        // w 3cim moze byc wypisywanie na konsoli
    }
}
