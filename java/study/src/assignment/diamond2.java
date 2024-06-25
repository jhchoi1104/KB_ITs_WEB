package assignment;

import java.util.Scanner;

public class diamond2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("선택>");

        int size = scanner.nextInt();

        for (int i=0;i<size;i++) {
            for (int j=0;j<size-i;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=size-2;i>=0;i--) {
            for (int j=0;j<size-i;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
