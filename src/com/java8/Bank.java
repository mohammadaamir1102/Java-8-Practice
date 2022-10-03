package com.java8;

import java.util.List;

public class Bank {

    private Integer accountHolderId;
    private String accountHolderName;
    private List<String> accountHolderPhoneNumber;

    public Bank() {
    }

    public Bank(Integer accountHolderId, String accountHolderName, List<String> accountHolderPhoneNumber) {
        this.accountHolderId = accountHolderId;
        this.accountHolderName = accountHolderName;
        this.accountHolderPhoneNumber = accountHolderPhoneNumber;
    }

    public Integer getAccountHolderId() {
        return accountHolderId;
    }

    public void setAccountHolderId(Integer accountHolderId) {
        this.accountHolderId = accountHolderId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public List<String> getAccountHolderPhoneNumber() {
        return accountHolderPhoneNumber;
    }

    public void setAccountHolderPhoneNumber(List<String> accountHolderPhoneNumber) {
        this.accountHolderPhoneNumber = accountHolderPhoneNumber;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountHolderId=" + accountHolderId +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountHolderPhoneNumber=" + accountHolderPhoneNumber +
                '}';
    }
}
