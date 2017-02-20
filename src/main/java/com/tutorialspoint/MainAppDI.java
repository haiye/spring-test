package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppDI {
    public static void main(String[] args) {
        
        System.out.println("DI using constructor");
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansDIByConstructor.xml");
//        TextEditorDIConstructor teDIConstructor = (TextEditorDIConstructor) context.getBean("textEditorDIConstructor");
//        teDIConstructor.spellCheck();
        
        System.out.println("DI using setter");
        TextEditorDISetterByName teDISetter = (TextEditorDISetterByName) context.getBean("textEditor");
//        System.out.println("bean name ="+context.getBeanNamesForType(SpellChecker.class)[0]);
//        System.out.println("bean id ="+context.getBeanIdsForType(teDISetter.getClass())[0]);
        

        teDISetter.spellCheck();
    }
}