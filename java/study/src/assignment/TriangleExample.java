package assignment;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("선택>");
        int size = scanner.nextInt();
        for (int i =1; i<= size; i++ ) {
            for (int j=1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
