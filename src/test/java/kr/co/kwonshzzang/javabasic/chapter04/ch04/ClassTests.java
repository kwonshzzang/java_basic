package kr.co.kwonshzzang.javabasic.chapter04.ch04;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ClassTests {
    @Test
    void test() throws ClassNotFoundException {
        Class c3 = Class.forName("java.lang.String");

        Constructor<String>[] cons = c3.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }

        System.out.println("============================================");
        Method[] methods = c3.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
    @Test
    void personTest() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person("James");
        System.out.println(person);

        Class c1 = Class.forName("kr.co.kwonshzzang.javabasic.chapter04.ch04.Person");
        Person person1 = (Person) c1.newInstance();
        System.out.println(person1);

        Class[] parameterTypes = {String.class};
        Constructor cons = c1.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person personLee = (Person) cons.newInstance(initargs);
        System.out.println(personLee);
    }
}
