package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};

        long count2 =Arrays.stream(arr)
                .filter(i-> i%2==0)
                .count();
        System.out.println(count2);

        long sum2 = Arrays.stream(arr)
                .filter(i-> i%2==0)
                .sum();
        System.out.println(sum2);

        double avg2 = Arrays.stream(arr)
                .filter(i->i%2==0)
                .average()
                .getAsDouble();
        System.out.println(avg2);

        int max2 = Arrays.stream(arr)
                .filter(i->i%2==0)
                .max()
                .getAsInt();
        System.out.println(max2);

        int min2 = Arrays.stream(arr)
                .filter(i->i%2==0)
                .min().getAsInt();
        System.out.println(min2);

        int firstItem = Arrays.stream(arr)
                .filter(i->i%3==0)
                .findFirst()
                .getAsInt();
        System.out.println(firstItem);

    }
}
