package com.mattjtodd.spring.stagemonitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class Controller {

    private static class DomainObject {
        private final String property1;
        private final String property2;

        public DomainObject(String property1, String property2) {
            this.property1 = property1;
            this.property2 = property2;
        }

        public String getProperty1() {
            return property1;
        }

        public String getProperty2() {
            return property2;
        }
    }

    private static final String UUID = java.util.UUID.randomUUID().toString();

    @Autowired
    private Repository repository;

    @RequestMapping(value = "/index",produces = "application/json; charset=utf-8")
    public DomainObject index() {
        return new DomainObject(repository.getUUID(), UUID);
    }

    @RequestMapping(value = "/oops",produces = "application/json; charset=utf-8")
    public DomainObject ooops() {
        throw new RuntimeException("Arrrgh");
    }

    @RequestMapping(value = "/log",produces = "application/json; charset=utf-8")
    public DomainObject log() {

        Logger.getAnonymousLogger().info("**********************************");

        return null;
    }
}
