package com.session;


class Bank{
    String state;

    public Bank() {
    }

    public Bank(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "state='" + state + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setState(DedupeEnum.NEW.toString());
        System.out.println(bank);

    }
}
