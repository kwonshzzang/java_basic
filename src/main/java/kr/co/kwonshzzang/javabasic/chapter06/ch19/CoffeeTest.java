package kr.co.kwonshzzang.javabasic.chapter06.ch19;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee etiopiaCoffee = new EtiopiaAmericano();
        etiopiaCoffee.brewing();

        System.out.println();
        Coffee etiopiaLatte = new Latte(etiopiaCoffee);
        etiopiaLatte.brewing();

        System.out.println();
        Coffee etiopiaMocha = new Mocha(etiopiaCoffee);
        etiopiaMocha.brewing();

        System.out.println();
        Coffee kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMocha.brewing();

        Coffee etiopiaWhippedCreamMocha =
                new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
        etiopiaCoffee.brewing();
    }
}
