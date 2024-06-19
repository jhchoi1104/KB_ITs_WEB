package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 90) {
            System.out.println("You got a score A");
        } else if (score >= 80) {
            System.out.println("You got a score B");
        } else if (score >= 70) {
            System.out.println("You got a score C");
        } else {
            System.out.println("You got a score D");
        }
    }
}
