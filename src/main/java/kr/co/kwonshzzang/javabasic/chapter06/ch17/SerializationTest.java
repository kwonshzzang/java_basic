package kr.co.kwonshzzang.javabasic.chapter06.ch17;

import java.io.*;

//class Person implements Serializable {
//    String name;
//    transient String job;
//
//    public Person() {}
//
//    public Person(String name, String job) {
//        this.name = name;
//        this.job = job;
//    }
//
//    public String toString() {
//        return name +  "," + job;
//    }
//}


class Person implements Externalizable {
    String name;
    String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + "," + job;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        job = in.readUTF();
    }
}


public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person personAhn = new Person("이순신", "대표이사");
        Person personKim = new Person("김유신", "상무이사");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.out"))) {
            oos.writeObject(personAhn);
            oos.writeObject(personKim);
        } catch(IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.out"))) {
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
