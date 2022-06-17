package kr.co.kwonshzzang.javabasic.chapter03.ch04;

public class VIPCustomer extends Customer {
    private int agentId;
    double salesRatio;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentId() {
        return agentId;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price*salesRatio);
    }
}
