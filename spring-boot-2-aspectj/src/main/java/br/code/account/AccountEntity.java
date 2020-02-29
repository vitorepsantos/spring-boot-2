package br.code.account;

import org.springframework.stereotype.Component;

@Component
public class AccountEntity {

    int balance = 20;

    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }
        balance = balance - amount;
        return true;
    }

}
