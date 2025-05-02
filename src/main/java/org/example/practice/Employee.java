package org.example.practice;

import java.util.Objects;

public class Employee {
    private long empId;
    private String name;
    private String emailId;
    private String designation;
    private long mobNo;

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && mobNo == employee.mobNo && Objects.equals(name, employee.name) && Objects.equals(emailId, employee.emailId) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, emailId, designation, mobNo);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emailId='" + emailId + '\'' +
                ", designation='" + designation + '\'' +
                ", mobno=" + mobNo +
                ", empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}
