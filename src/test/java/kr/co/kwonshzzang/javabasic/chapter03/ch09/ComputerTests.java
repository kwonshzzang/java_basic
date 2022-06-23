package kr.co.kwonshzzang.javabasic.chapter03.ch09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTests {
    @Test
    void createInstance() {
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();

        NoteBook myNote = new MyNoteBook();
        myNote.display();
        myNote.typing();
    }

}