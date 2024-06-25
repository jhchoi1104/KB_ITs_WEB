package assignment;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("선택>");
        int size = scanner.nextInt();

        int [] array = new int[size];

        for (int k=0;k<size;k++) {
            for (int l=0;l<k;l++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i=0;i<size;i++) {
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<(size-i);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
