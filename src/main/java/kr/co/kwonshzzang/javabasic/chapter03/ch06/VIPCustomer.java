package kr.co.kwonshzzang.javabasic.chapter03.ch06;

public class VIPCustomer extends Customer {
    double salesRatio;
    private int agentId;

    public VIPCustomer(int customerId, String customerName, int agentId) {
        super(customerId, customerName);
        this.agentId = agentId;
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }

    @Override
    public String toString() {
        return super.toString() + " 담당 상담원 번호는 " + agentId + "입니다.";
    }
}
