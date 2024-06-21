package ch08.sec04;

import javax.print.DocFlavor;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 껐습니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
        }
        else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
        } else {
            volume = volume;
        }
        System.out.println("현재 TV 볼륨: 값: " + volume );
    }
}
