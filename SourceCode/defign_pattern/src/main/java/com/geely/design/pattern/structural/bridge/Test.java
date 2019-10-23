package com.geely.design.pattern.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        ABCBank abcBank = new ABCBank(new SavingAccount());
        Account abaBankAccount = abcBank.openAccount();
        abaBankAccount.showAccountType();
    }

}
