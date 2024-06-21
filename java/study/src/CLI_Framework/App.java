package CLI_Framework;

import java.util.Scanner;

public class App {
    boolean run = true;
    int studentNum = 0;
    int[] scores = null;

    Menu menu;

    public App() {
        menu = new Menu();
    }

    private void analize() {
        int max = 0;
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            max = (max < scores[i]) ? scores[i] : max;
            sum += scores[i];
        }
        avg = (double) sum / studentNum;
        System.out.println(max);
        System.out.println(avg);
    }

    public void getStudentNum() {
        System.out.print("학생수>");
//        studentNum = Integer.parseInt(scanner.nextLine());
        scores = new int[studentNum];
    }

    public void getScores() {
        for (int i = 0; i < scores.length; i++) {
            System.out.print("scores[" + i + "]>");
//            scores[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    public void printScore() {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]");
        }
    }

    public void exit() {
        run = false;
    }

    public void executeCommand(int selectNo) {
        if (selectNo == 1) {
            getStudentNum();
        } else if (selectNo == 2) {
            getScores();
        } else if (selectNo == 3) {
            printScore();
        } else if (selectNo == 4) {
            analize();
        } else if (selectNo == 5) {
            exit();
        }
    }

    public void run() {
        while(run) {
            menu.printMenu();
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
        }
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
