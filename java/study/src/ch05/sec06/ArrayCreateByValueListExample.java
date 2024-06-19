package ch05.sec06;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Autumn", "Winter"};

        int[] scores = {83,90,87};

        System.out.println(season[0]);
        System.out.println(season[1]);
        System.out.println(season[2]);
        System.out.println(season[3]);

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println(sum);
        System.out.println(sum/scores.length);
    }
}
