package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.BUser;
import kz.bcc.tutorial.balatime.repository.BUserRepository;
import kz.bcc.tutorial.balatime.service.IBUserServiceAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BUserServiceAccess implements IBUserServiceAccess {

    @Autowired
    private BUserRepository userRepository;


    @Override
    public BUser findByLoginIgnoreCase(String login) {
        return userRepository.findByLoginIgnoreCase(login);
    }

}
