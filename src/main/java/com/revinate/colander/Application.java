package com.revinate.colander;

import com.revinate.px.logging.annotations.EnableForestLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableForestLogger
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
