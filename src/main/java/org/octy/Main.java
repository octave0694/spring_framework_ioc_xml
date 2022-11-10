package org.octy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        System.out.println();
        System.out.println("***Hello SPRING!***\n");
        System.out.println(context.getBean(Person.class));
    }
}