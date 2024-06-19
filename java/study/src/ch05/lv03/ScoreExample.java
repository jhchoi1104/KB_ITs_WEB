package ch05.lv03;

import java.util.Scanner;

public class ScoreExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Score myScore = new Score();

        while (true) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.print("학생수>");
                int input2 = scanner.nextInt();
                myScore.count(input2);
            }
            else if (input == 2) {
                int iterNum = myScore.reCount();
                for (int i = 0; i < iterNum; i++) {
                    System.out.print("scores[" + i + "]>");
                    int input3 = scanner.nextInt();
                    myScore.score(input3,i);

                }
            }
            else if (input == 3) {
                myScore.show();
            } else if (input == 4) {
                myScore.analyze();
            } else {
                myScore.out();
                break;
            }
        }

    }
}
