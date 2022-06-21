package kr.co.kwonshzzang.javabasic.chapter03.ch06;

public class VIPCustomer extends Customer {
    private int agentId;
    double salesRatio;

    public VIPCustomer(int customerId, String customerName, int agentId) {
        super(customerId, customerName);
        this.agentId = agentId;

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

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentId + "입니다";
    }
}
