package org.lilly.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"org.lilly"})
public class LillyDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(LillyDemoApplication.class, args);


    }

}
