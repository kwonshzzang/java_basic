package kr.co.kwonshzzang.javabasic.chapter02.ch12;

public class Person {
    String name;
    int age;

    public Person() {
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + " , " + age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();

        Person p1 = new Person("James", 37);
        Person p2 = p1.getPerson();

        System.out.println(p1);
        System.out.println(p2);
    }
}
