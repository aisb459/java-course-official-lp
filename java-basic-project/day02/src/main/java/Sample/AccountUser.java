package Sample;

import java.util.ArrayList;
import java.util.List;

public class AccountUser {
    public static void main(String[] args){
        List<Transactions> transactions = new ArrayList<>();

        Account acc=new Account(20000,111000222);
        acc.printBalance();

        acc.deposit(10000);
        transactions.add(new Transactions(acc.getAccountNumber(),10000,"credit"));


        acc.deposit(10000);
        transactions.add(new Transactions(acc.getAccountNumber(),10000,"credit"));
        System.out.println("after deposit twice");
        acc.printBalance();

        acc.withdraw(1000);
        transactions.add(new Transactions(acc.getAccountNumber(),10000,"debit"));
        acc.withdraw(1000);
        transactions.add(new Transactions(acc.getAccountNumber(),10000,"debit"));
        acc.withdraw(1000);
        transactions.add(new Transactions(acc.getAccountNumber(),10000,"debit"));
        System.out.println("after withdrawl "+acc.withdrawlCount+"times");
        acc.printBalance();
        acc.withdraw(1000);
        transactions.add(new Transactions(acc.getAccountNumber(),10000,"debit"));
        acc.withdraw(1000);
        transactions.add(new Transactions(acc.getAccountNumber(),10000,"debit"));
        System.out.println("after withdrawl "+acc.withdrawlCount+"times");
        acc.printBalance();

        








    }





}
