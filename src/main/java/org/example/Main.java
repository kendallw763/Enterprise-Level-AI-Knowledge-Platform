package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        System.out.print("INITIALIZING SPRING..." + "\n");
        SpringApplication.run(Main.class, args);
        System.out.print('\n' + " SPRING INITIALIZATION COMPLETE...");
    }
}

