package kr.co.kwonshzzang.javabasic.chapter03.ch03;

public class VIPCustomer extends Customer {
    private int agentId;
    double salesRatio;

//    public VIPCustomer() {
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//
//        System.out.println("VIPCustomer() 생성자 호출");
//    }

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() 생성자 호출");
    }

    public int getAgentId() {
        return agentId;
    }
}
