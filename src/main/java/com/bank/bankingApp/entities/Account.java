package com.bank.bankingApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
    @Setter
    @Entity
    public class Account {

        @Id // definition identifiant
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String accountHolderName;
        private String accountNumber;

    public double getBalance() { //ceci est un getter
        return balance;
    }

    public void setBalance(double balance) {//ceci est un setter
        this.balance = balance;
    }

    private double balance;
}
