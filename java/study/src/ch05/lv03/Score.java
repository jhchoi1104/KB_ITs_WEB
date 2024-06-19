package ch05.lv03;

public class Score {

    int studentNum;
    int[] scores = new int[studentNum];

    void count(int input) {
        this.studentNum = input;
        this.scores = new int[studentNum];
    };
    int reCount() {
        return this.studentNum;
    }
    void score(int score, int i) {
        this.scores[i] = score;
    };
    void show() {
        for (int i : scores) {
            System.out.println(i);
        }
    };
    void analyze() {
        int sum = 0;
        for (int i : this.scores) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(sum/this.scores.length);
    }
    void out() {
        System.out.println("프로그램 종료");
    }


}
