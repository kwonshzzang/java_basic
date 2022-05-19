package kr.co.kwonshzzang.javabasic.chapter05.ch07;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());
        Powder powder = powderGenericPrinter.getMaterial();
        System.out.println(powderGenericPrinter);
        powderGenericPrinter.printing();

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticGenericPrinter.getMaterial();
        System.out.println(plasticGenericPrinter);
        plasticGenericPrinter.printing();

//        GenericPrinter<Water> waterGenericPrinter = new GenericPrinter<>();
    }
}
