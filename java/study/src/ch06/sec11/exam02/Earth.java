package ch06.sec11.exam02;

public class Earth {
    static final double radius = 64000;

    static final double area;

    static {
        area = 4* Math.PI * radius * radius;
    }
}
