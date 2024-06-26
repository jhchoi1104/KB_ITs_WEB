package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        long sum = summation();
        long time2 = System.nanoTime();

        System.out.println(sum);
        System.out.println(time2-time1);
    }
    public static long summation() {
        long sum =0;
        for (long i=0;i<=1000000; i++) {
            sum += i;
        }
        return sum;
    }
}
