package ch17.sec07;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingExample {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동",30));
        studentList.add(new Student("신용권",10));
        studentList.add(new Student("유미선",20));

        studentList.stream()
                .sorted()
                .forEach(i->System.out.println(i.getName()+": "+i.getScore()));

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(i-> System.out.println(i.getName()+":"+i.getScore()));
    }
}
