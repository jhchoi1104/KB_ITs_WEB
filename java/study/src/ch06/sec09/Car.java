package ch06.sec09;

public class Car {
    private String model;
    private int speed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.println(this.model+"가 달립니다.(시속: "+this.speed+")km/h" );
    }
}
