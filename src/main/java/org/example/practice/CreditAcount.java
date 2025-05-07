package org.example.practice;

public record CreditAcount() implements Account {

    @Override
    public void displayAccount() {
        System.out.println("Show credit balance:Credit");
    }
}
