package kr.co.kwonshzzang.javabasic.chapter05.ch06;

import java.util.ArrayList;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        Powder p = powderGenericPrinter.getMaterial();
        System.out.println(powderGenericPrinter);

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        System.out.println(plasticGenericPrinter);

        var list = new ArrayList<>();
    }
}
