package assignment;

import java.util.Scanner;

public class hexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("선택>");
        int size = scanner.nextInt();

        System.out.print(" ");
        for (int i=0;i<(size);i++) {
            System.out.print("*");
        }
        System.out.print(" \n");

        for (int i=0;i<(size+2);i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print(" ");
        for (int i=0;i<(size);i++) {
            System.out.print("*");
        }


    }
}
