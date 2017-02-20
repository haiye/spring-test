package com.tutorialspoint;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class BeanPostProcessorExample implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : bean=" + bean.getClass().getName() + " beanName=" + beanName);
        return bean; // you can return any other object as well
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization : bean=" + bean.getClass().getName() + " beanName=" + beanName);
        return bean; // you can return any other object as well
    }
}