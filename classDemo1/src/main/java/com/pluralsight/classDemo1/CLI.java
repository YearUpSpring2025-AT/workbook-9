package com.pluralsight.classDemo1;

import org.springframework.boot.CommandLineRunner;

public class CLI implements CommandLineRunner {

    @Override
    public void run(String... args){
        System.out.println("Hello World fromCLI");
    }
}
