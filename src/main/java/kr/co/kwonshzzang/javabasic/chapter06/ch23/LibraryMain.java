package kr.co.kwonshzzang.javabasic.chapter06.ch23;


import java.util.ArrayList;
import java.util.List;

class FastLibrary {
    public List<String> shelf = new ArrayList<>();

    public FastLibrary() {
        shelf.add("태백산맥1");
        shelf.add("태백산맥2");
        shelf.add("태백산맥3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();

        while(shelf.size() == 0) {
            System.out.println(t.getName() + " waiting start.");
            wait();
            System.out.println(t.getName() + " waiting end.");
        }

        String book = shelf.remove(0);
        System.out.println(t.getName() + ": " + book + " lend.");
        return book;

    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();

        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + ": " + book + " return.");
    }
}

class Student extends Thread {

    public Student(String name) {
        super(name);
    }

    public void run() {
        try {
            String title = LibraryMain.library.lendBook();
            if(title == null)  {
                System.out.println(getName() + "가 빌리지 못했음.");
                return;
            }

            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class LibraryMain {
    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {
        Student std1 = new Student("std1");
        Student std2 = new Student("std2");
        Student std3 = new Student("std3");
        Student std4 = new Student("std4");
        Student std5 = new Student("std5");
        Student std6 = new Student("std6");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
}
