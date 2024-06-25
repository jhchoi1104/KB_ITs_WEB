package assignment;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("선택>");

        int size = scanner.nextInt();

        for (int i=0;i<size;i++) {
            for (int j=0; j<size;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
