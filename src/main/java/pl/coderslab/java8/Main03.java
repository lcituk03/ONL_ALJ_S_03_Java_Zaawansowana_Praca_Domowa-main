package pl.coderslab.java8;

import java.util.function.Function;

public class Main03 {
    public static void main(String[] args) {

        Function<String,String> sampleText = n ->  n.substring(2, n.length()-2).toLowerCase();
        String sample = "CODERSLAB";
        System.out.println(sampleText.apply(sample));

    }
}
