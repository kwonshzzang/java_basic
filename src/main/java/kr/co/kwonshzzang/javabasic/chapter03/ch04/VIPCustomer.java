package kr.co.kwonshzzang.javabasic.chapter03.ch04;

public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentId;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }
}
