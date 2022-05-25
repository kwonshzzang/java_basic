package kr.co.kwonshzzang.javabasic.chapter02.ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Edward", 20000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);
        Taxi taxiS = new Taxi("잘나간다 운수");

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);
        studentE.takeTaxi(taxiS);

        studentJ.showInfo();;
        studentT.showInfo();
        studentE.showInfo();

        bus100.showInfo();
        subwayGreen.showInfo();
        taxiS.showInfo();
    }
}
