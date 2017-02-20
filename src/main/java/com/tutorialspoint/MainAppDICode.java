package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainAppDICode {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans_DI_code_Autowired_Qualifier.xml");
      Profile profile = (Profile) context.getBean("profile");
      profile.printAge();
      profile.printName();
   }
}