package org.lilly.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {"org.lilly"})
public class LillyDemoApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(LillyDemoApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
