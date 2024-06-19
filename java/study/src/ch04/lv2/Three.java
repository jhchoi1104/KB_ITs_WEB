package ch04.lv2;

public class Three {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
