package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("I am a best boxer in ufc");

        list1.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(i -> System.out.println(i));
        System.out.println();
    }
}
