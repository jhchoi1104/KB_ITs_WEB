package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void printItem (int[] scores) {
        for (int score : scores) {
            System.out.println(score);
        }
    }

    public static void main(String[] args) {
        int[] scores = new int[] { 90, 80, 70};

        printItem(scores);
    }
}
