package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream list = IntStream.rangeClosed(1,100);

        list.forEach(i -> sum+=i );

        System.out.println(sum);
    }
}
