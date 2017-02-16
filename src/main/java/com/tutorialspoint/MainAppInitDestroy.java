package com.tutorialspoint;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainAppInitDestroy {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansInitDestroy.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
     }
}
