package kr.co.kwonshzzang.javabasic.chapter03.ch03;

public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentId;

    public VIPCustomer(int customerId, String customerName) {
//        super();  default
        super(customerId, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer(int String) 생성자 호출!");
    }
}
