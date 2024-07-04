package ch17.sec06.exam02;

import java.util.Arrays;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        Arrays.stream(intArray)
                .asDoubleStream()
                .forEach(i->System.out.println(i));

        Arrays.stream(intArray)
                .asLongStream()
                .forEach(i->System.out.println(i));
    }

}
