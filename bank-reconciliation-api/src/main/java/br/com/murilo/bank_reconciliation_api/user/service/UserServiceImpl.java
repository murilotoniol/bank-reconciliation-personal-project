package br.com.murilo.bank_reconciliation_api.user.service;

import br.com.murilo.bank_reconciliation_api.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository){
        this.userRepository = userRepository;
    }
}
