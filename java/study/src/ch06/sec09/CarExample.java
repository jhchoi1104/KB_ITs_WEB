package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("현대차");
        String model = myCar.getModel();
        System.out.println(model);

        myCar.setSpeed(1000);
        int speed = myCar.getSpeed();
        System.out.println(speed);
    }
}
