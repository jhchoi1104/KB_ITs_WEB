package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        System.out.println("----------------");
        Scanner sc = new Scanner(System.in);
        int speed =0;

        while (true)  {
            System.out.print("선택: ");
            String string = sc.nextLine();
            if (string.equals("1")) {
                speed += 1;
                System.out.println("현재 속도 = " + speed);
                System.out.println("----------------");
            } else if (string.equals("2")) {
                speed -= 1;
                System.out.println("현재 속도 = "+ speed);
                System.out.println("----------------");

            } else if (string.equals("3")) {
                break;
            }
        }




    }
}
