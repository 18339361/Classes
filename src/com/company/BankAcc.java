package com.company;

public class BankAcc {
    private String name;
    private String email;
    private long phoneNum;
    private long accNum;
    private long balance;

    public BankAcc(String name, String email, long phoneNum, long accNum, long balance) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.accNum = accNum;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public long getAccNum() {
        return accNum;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(double money){
        System.out.println("Current Balance: " + getBalance());
        this.balance += money;
        System.out.println("New Balance: " + getBalance());
    }

    public void withdraw(double money){
        System.out.println("Current Balance: " + this.balance);
        if(this.balance-money>=0){
            this.balance -= money;
            System.out.println("New Balance: " + this.balance);
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    public void changePhone(long newNumber){
        System.out.println("Current number:" + getPhoneNum());
        this.phoneNum= newNumber;
        System.out.println("New number:" + getPhoneNum());
    }

}
