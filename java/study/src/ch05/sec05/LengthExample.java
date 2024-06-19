package ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9811041150324";
        if (ssn.length() == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println(ssn);
        }
    }
}
