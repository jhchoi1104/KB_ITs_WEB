package ch06.sec06.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("종현초이", "981104-1******");
        Korean k2 = new Korean("정빈바크","981112-1******");

        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println();
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}
