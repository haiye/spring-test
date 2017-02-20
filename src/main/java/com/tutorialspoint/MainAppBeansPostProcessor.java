package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppBeansPostProcessor {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansPostProcessor.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage1();
        context.registerShutdownHook();
    }
}