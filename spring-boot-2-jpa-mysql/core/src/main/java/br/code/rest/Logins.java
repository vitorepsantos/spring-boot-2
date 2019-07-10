package br.code.rest;

import br.code.dao.Login;
import br.code.dao.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class Logins {

    private LoginRepository loginRepository;

    @Autowired
    public Logins(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @PostMapping(value = "/login/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public void post(@RequestBody LoginsModel loginsModel) {
        Login login = new Login(1L, loginsModel.getUsername());
        this.loginRepository.save(login);
    }

}
