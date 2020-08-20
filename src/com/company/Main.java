package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAcc pranchalAcc= new BankAcc("pranchal", "whatever@gmail.com", 628899, 123, 0);

        System.out.println(pranchalAcc.getName() + "\n" + pranchalAcc.getBalance() + "\n");

        pranchalAcc.deposit(150);
        System.out.println("*****************");

        pranchalAcc.withdraw(160);
        System.out.println("*****************");

        pranchalAcc.withdraw(50);
        System.out.println("*****************");

        pranchalAcc.withdraw(100);
        System.out.println("**********************");

        pranchalAcc.changePhone(830615275);
        System.out.println("--------------------------------------");
        //////////////////////////////////////////////////////////////////////////////////////////

        BankAcc salomeAcc= new BankAcc("Salome", "whatever@gmail.com", 256399, 738, 1500);
        System.out.println(salomeAcc.getEmail() + "\n" + salomeAcc.getAccNum() + "\n");

        salomeAcc.deposit(3000);
        System.out.println("*****************");
        salomeAcc.withdraw(200);
        System.out.println("*****************");

        salomeAcc.changePhone(8353783);
    }
}
