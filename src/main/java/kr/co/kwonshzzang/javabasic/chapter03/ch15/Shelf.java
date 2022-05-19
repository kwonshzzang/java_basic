package kr.co.kwonshzzang.javabasic.chapter03.ch15;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    protected List<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>();
    }

    public List<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
