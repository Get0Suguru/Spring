package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mySpringApp {



    public static void main(String[] args) {
        // now we go to application context for the object  ||  we won't make it anymore
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");




        Vehicle normalObjectHunBhai = context.getBean("myVehicle", Vehicle.class);   // in getBean( name/id of bean(obj)  ,  cast it to what type )
        Vehicle vehicle2 = context.getBean("myVehicle", Vehicle.class);

//        been is our obj and we caN call methods and use it normally like a new obj we create and use
//        BEAN is externally  created by iOC (Spring) with data from config file

        System.out.println(normalObjectHunBhai.milage());
        System.out.println(normalObjectHunBhai.showEngine());


// NOTED -> weird haan i could only access the beans(ogObj) method defined not the parameters and variables | not even in the class just the one in the interface
        System.out.println(normalObjectHunBhai.getModelName());
        System.out.println(normalObjectHunBhai.getCost());


        System.out.println(normalObjectHunBhai == vehicle2);            // bcoz we made the bean prototype not singleton

        Engine v12 = context.getBean("myVehicleEngine", Engine.class);
        Engine f140 = context.getBean("myVehicleEngine", Engine.class);

        System.out.println(v12 == f140);
    }
}
