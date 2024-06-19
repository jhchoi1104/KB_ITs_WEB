package ch04.lv2;

public class DrawStar {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < (6-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
