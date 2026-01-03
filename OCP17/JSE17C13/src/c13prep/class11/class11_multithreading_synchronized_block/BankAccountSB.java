/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c13prep.class11.class11_multithreading_synchronized_block;

import c13prep.class11.class11_multithreading_synchronized_method.*;

/**
 *
 * @author Administrator
 */
public class BankAccountSB {

    private final String id;
    private int balance;

    public BankAccountSB(int balance) {
        this.id = "BA" + Math.random()*1_000_000_000;
        this.balance = balance;
    }

    public synchronized  int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        this.balance += amount;
        System.err.println("D: " + this.balance);
    }
    
    public synchronized void withdrawal(int amount) {
        this.balance -= amount;
        System.err.println("W: " + this.balance);
    }

    public String getId() {
        return id;
    }
    
    
}
