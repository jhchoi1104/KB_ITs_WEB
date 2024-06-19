package ch04.lv3;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("선택>");
            String command = input.nextLine();
            if (command.equals("1")) {

                System.out.print("예금액>");
                String money = input.nextLine();
                System.out.print("잔고>");
                balance += Integer.parseInt(money);
                System.out.println(balance);

            } else if (command.equals("2")) {

                System.out.print("출금액>");
                String money = input.nextLine();
                System.out.print("잔고>");
                balance -= Integer.parseInt(money);
                System.out.println(balance);

            } else if (command.equals("3")) {

                System.out.print("잔고>");
                System.out.println(balance);
            } else if (command.equals("4")) {
                System.out.println();
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
