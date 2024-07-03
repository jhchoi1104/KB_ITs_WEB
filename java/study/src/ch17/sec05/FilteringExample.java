package ch17.sec05;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FilteringExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        list.stream()
                .distinct()
                .forEach(i->System.out.println(i));
        System.out.println();

        list.stream()
                .filter(i->i.startsWith("신"))
                .forEach(i -> System.out.println(i));
        System.out.println();

        list.stream()
                .distinct()
                .filter(i-> i.startsWith("신"))
                .forEach(i->System.out.println(i));

    }
}
