package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println(myCar.getSpeed());

        myCar.setSpeed(100);
        System.out.println(myCar.getSpeed());

        myCar.setStop(true);
        System.out.println(myCar.getSpeed());

    }
}
