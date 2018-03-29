package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseCalculatorApplication.class, args);
    }{
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5.3,7.4));
        System.out.println(calculator.subtract(8,7.6));
    }
}
