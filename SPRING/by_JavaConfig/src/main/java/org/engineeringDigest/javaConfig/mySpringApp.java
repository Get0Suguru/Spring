package org.engineeringDigest.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mySpringApp {
    public static void main(String[] args) {

        // the problem is with the parameter that object constructor takes
        // the xml one take the string but the javaConfig one take direct Class of configuration

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Vehicle normalObjHunBhai = context.getBean("myCar", Vehicle.class);
        System.out.println(normalObjHunBhai.startEngine());
        System.out.println(normalObjHunBhai.getMrpOfVehicle());

        context.close();
    }
}