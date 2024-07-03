package ch16.sec05.exam03;

public class Person {
    public Member getMember1(Createtable1 createtable1) {
        String id = "winter";
        Member member = createtable1.create(id);
        return member;
    }

    public Member getMember2(Createtable2 createtable2) {
        String id = "winter";
        String name = "한겨울";
        Member member = createtable2.create(id, name);
        return member;
    }
}
