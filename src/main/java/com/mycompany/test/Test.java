/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author ro
 */
@SpringBootApplication(scanBasePackages = "com.mycompany.test")
public class Test {

    public static void main(String[] args) {
      
        SpringApplication.run(Test.class, args);
 
    }
}