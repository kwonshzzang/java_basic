package kr.co.kwonshzzang.javabasic.chapter02.ch21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTests {
    @Test
    void createTest_1() {
        Book[] library = new Book[5];

        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }

    @Test
    void createTest_2() {
        Book[] library = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        for(Book book : library) {
            book.showBookInfo();
        }
    }

    @Test
    void arrayCopy_shallow() {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        System.out.println("============== copy library ==============");
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("============== library ==============");
        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("============== copy library ==============");
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }
    }

    @Test
    void arrayCopy_Deep() {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i = 0; i < library.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("============== library ==============");
        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("============== copy library ==============");
        for(Book book : copyLibrary) {
            book.showBookInfo();
        }



    }


}