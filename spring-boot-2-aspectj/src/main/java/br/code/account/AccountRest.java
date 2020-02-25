package br.code.account;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRest {

    @GetMapping(value = "/withdraw", produces = MediaType.APPLICATION_JSON_VALUE)
    public void get(){
        System.out.println("withdraw");
        Account account = new Account();
        account.withdraw(5);
    }

}
