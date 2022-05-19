package kr.co.kwonshzzang.javabasic.chapter03.ch02;

public class VIPCustomer extends Customer {
    private int agentId;
    private double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentId() {
        return this.agentId;
    }
}
