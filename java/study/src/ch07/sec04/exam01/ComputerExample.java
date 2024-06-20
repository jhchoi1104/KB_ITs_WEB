package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();
        Calculator myCalc = new Calculator();

        double area1 = myCom.areaCircle(54);
        double area2 = myCalc.areaCircle(54);
        System.out.println(area1);
        System.out.println(area2);
    }

}
