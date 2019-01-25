package com.ns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan(basePackages="com.ns.*")
public class Start {

  
  public static void main(String[] args) {
    SpringApplication.run(Start.class, args);
  }

}
