package com.mattjtodd.spring.stagemonitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final String UUID = java.util.UUID.randomUUID().toString();

    @Autowired
    private Repository repository;

    @RequestMapping("/index")
    public String index() {
        return repository.getUUID() + " : " + UUID;
    }
}
