package org.example.practice;

public record SavingAcount() implements Account {
    @Override
    public void displayAccount() {
        System.out.println("Display account: Saving");
    }
}
