package com.ns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import com.ns.template.RedisUtil;

@EnableAutoConfiguration
@ComponentScan(basePackages="com.ns")
public class Start {

  @Autowired
  static ApplicationContext context;
  
  public static void main(String[] args) {
    SpringApplication.run(Start.class, args);
    System.out.println(set());
  }
  
  public static boolean set(){
    RedisUtil redisUtil=context.getBean(RedisUtil.class);
    return redisUtil.expire("i am king", 1);
  }
  
}
