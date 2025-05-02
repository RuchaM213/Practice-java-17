package org.example.practice;

import java.util.Objects;

public class Customer {
    private long custId;
    private String name;
    private String emailId;
    private String designation;
    private long mobNo;

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Customer customer = (Customer) o;
        return custId == customer.custId && mobNo == customer.mobNo && Objects.equals(name, customer.name) && Objects.equals(emailId, customer.emailId) && Objects.equals(designation, customer.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, name, emailId, designation, mobNo);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name=" + name +
                ", emailid=" + emailId +
                ", designation=" + designation +
                ", mobno=" + mobNo +
                '}';
    }
}
