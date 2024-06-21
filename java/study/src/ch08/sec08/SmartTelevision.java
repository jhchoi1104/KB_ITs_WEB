package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnOn() {
        System.out.println("SmartTelevision을 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTelevision을 껐습니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url+"을 검색합니다.");
    }
}
