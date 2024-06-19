package ch02;

public class sec12 {
    public static void main(String[] args) {
        int value =123;
        System.out.printf("상품의 가격: %d\n", value);
        System.out.printf("상품의 가격: %6d\n", value);
        System.out.printf("상품의 가격: %-6d\n", value);
        System.out.printf("상품의 가격: %06d\n", value);

        double area = 3.14159 *100;
        System.out.printf("반지름이 %d인 원의 넓이: %5.2f\n", 10,area);

        String name ="홍길동";
        String job = "도적";
        System.out.printf("%6d | %-6s | %6s",1, name, job);
    }
}
