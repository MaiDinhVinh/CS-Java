/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c13prep.class11.class11_multithreading_synchronized_method;

/**
 *
 * @author Administrator
 */
public class BankAccountSM {

    private final String id;
    private int balance;

    public BankAccountSM(int balance) {
        this.id = "BA" + Math.random()*1_000_000_000;
        this.balance = balance;
    }

    public synchronized  int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        this.balance += amount;
    }

    public String getId() {
        return id;
    }
    
    
}
