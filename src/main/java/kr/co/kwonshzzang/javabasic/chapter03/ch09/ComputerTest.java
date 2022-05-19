package kr.co.kwonshzzang.javabasic.chapter03.ch09;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();
    }

    NoteBook myNote = new MyNoteBook();

}
