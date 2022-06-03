package kr.co.kwonshzzang.javabasic.chapter02.ch16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTests {
    @Test
    void create() {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
//        System.out.println(employeeLee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
//        employeeKim.serialNum++;

//        System.out.println(employeeLee.serialNum);
//        System.out.println(employeeKim.serialNum);
    }

    @Test
    void createInstance() {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + " , " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + " , " + employeeKim.getEmployeeId());

        System.out.println(Employee.getSerialNum());
    }

}