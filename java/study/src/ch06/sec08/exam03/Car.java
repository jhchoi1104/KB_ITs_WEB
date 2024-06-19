package ch06.sec08.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        boolean result = (this.gas != 0);
        if (result == true) {
            System.out.println("gas가 있습니다.");
        } else {
            System.out.println("gas가 없습니다.");
        }
        return result;
    }
    void run () {
        while (true) {
            if (this.gas == 0) {
                System.out.println("멈춥니다."+"(gas잔량: " +this.gas+")");
                break;
            } else {
                System.out.println("달립니다."+"(gas잔량: " +this.gas+")");
                this.gas = this.gas - 1;
            }

        }

    }
}
