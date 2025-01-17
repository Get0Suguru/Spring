package org.engineering;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mySpringApp {
    public static void main(String[] args) {


        // this is what we say the config file we gonna use for our ioc container to create object for us

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Car aNormalObject = context.getBean("car", Car.class);

        System.out.println(aNormalObject.milage());
        System.out.println(aNormalObject.getEngineBrand());
        System.out.println(aNormalObject.getMrp());
    }
}
