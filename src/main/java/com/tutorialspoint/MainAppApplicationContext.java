package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainAppApplicationContext {
    public static void main(String[] args) {
        
        ApplicationContext contextClasspath = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objClasspath = (HelloWorld) contextClasspath.getBean("helloWorld");
        objClasspath.getMessage();

        ApplicationContext contextFilePath = new FileSystemXmlApplicationContext("src/main/java/Beans.xml");
        HelloWorld objFilePath = (HelloWorld) contextFilePath.getBean("helloWorld");
        objFilePath.getMessage();
        
        ApplicationContext contextFileFullPath = new FileSystemXmlApplicationContext(
                "D:/ws/wsHelix/spring-test/src/main/java/Beans.xml");
        HelloWorld objFileFullPath = (HelloWorld) contextFileFullPath.getBean("helloWorld");
        objFileFullPath.getMessage();

    }

}