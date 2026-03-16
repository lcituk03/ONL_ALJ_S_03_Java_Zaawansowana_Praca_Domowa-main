package pl.coderslab.advanced.abstractclass;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main02 {
    public static void main(String[] args) {
        Person p1 = new Person("ala", "sala");
        Person p2 = new Person("ula", "kula");
        Person p3 = new Person("asia", "sasia");
        Person p4 = new Person("bsia", "basia");
        Person p5 = new Person("asia", "okasia");


        ArrayList<Person> people= new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }

    }





}
