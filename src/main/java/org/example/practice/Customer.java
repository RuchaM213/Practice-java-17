package org.example.practice;

import java.util.Objects;

public final class Customer {
    private final long custId;
    private final String name;
    private final String emailId;
    private final String designation;
    private final long mobNo;

    public Customer(long custId, String name, String emailId, String designation, long mobNo) {
        this.custId = custId;
        this.name = name;
        this.emailId = emailId;
        this.designation = designation;
        this.mobNo = mobNo;
    }

    public long getCustId() {
        return custId;
    }


    public String getName() {
        return name;
    }


    public String getEmailId() {
        return emailId;
    }


    public String getDesignation() {
        return designation;
    }


    public long getMobNo() {
        return mobNo;
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
