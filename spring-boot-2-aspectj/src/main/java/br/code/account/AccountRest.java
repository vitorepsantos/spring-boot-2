package br.code.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRest {

    @Autowired
    AccountEntity accountEntity;

    @GetMapping(value = "/withdraw", produces = MediaType.APPLICATION_JSON_VALUE)
    public void get(){
        accountEntity.withdraw(5);
    }

}
