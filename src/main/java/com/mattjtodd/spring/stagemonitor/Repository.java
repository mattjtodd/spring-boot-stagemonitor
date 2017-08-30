package com.mattjtodd.spring.stagemonitor;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Repository {
    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
