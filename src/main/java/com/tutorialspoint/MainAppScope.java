package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppScope {
    public static void main(String[] args) {
        scopeTest("BeansScopeSingleton.xml");
        scopeTest("BeansScopePrototype.xml");
    }

    public static void scopeTest(String xmlName) {
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlName);
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage1("I'm object A");
        objA.getMessage1();
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage1();
    }
}
