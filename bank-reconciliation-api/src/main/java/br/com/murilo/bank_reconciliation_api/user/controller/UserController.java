package br.com.murilo.bank_reconciliation_api.user.controller;

import br.com.murilo.bank_reconciliation_api.user.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
}
