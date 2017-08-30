package com.mattjtodd.spring.stagemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.stagemonitor.core.Stagemonitor;

@SpringBootApplication
@Configuration
public class Application {

    public static void main(String[] args) throws Exception {
        Stagemonitor.init();
        SpringApplication.run(Application.class, args);
    }
}
