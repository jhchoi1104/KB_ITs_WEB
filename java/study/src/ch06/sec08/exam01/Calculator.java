package ch06.sec08.exam01;

public class Calculator {
    void powerOn() {
    System.out.println("Power on");
    }
    int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    double divide(double a, double b) {
        double result = a / b;
        return result;
    }

    void powerOff() {
        System.out.println("Power off");
    }
}
