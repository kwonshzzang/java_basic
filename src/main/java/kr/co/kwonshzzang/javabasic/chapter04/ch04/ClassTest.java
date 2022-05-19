package kr.co.kwonshzzang.javabasic.chapter04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person("James", 20);
        System.out.println(person);

        Class c1 = Class.forName("kr.co.kwonshzzang.javabasic.chapter04.ch04.Person");
        Person person1 = (Person) c1.newInstance();
        person1.setName("Lee");
        person1.setAge(30);
        System.out.println(person1);

        Class c2 = person.getClass();
        Person person2 = (Person) c2.newInstance();
        System.out.println(person2);

        Class[] parameterTypes = {String.class, int.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"김유신", 50};
        Person personLee = (Person) cons.newInstance(initargs);
        System.out.println(personLee);

    }
}
