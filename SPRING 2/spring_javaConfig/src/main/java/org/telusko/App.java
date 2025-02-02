package org.telusko;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);          // as we know it won't take in "harshul solved it"
        Vehicle aNormalObj = context.getBean("car", Vehicle.class );
    // first letter of bean id will automatically get small (that's why i write car not Car)

        System.out.println(aNormalObj.getMilage());
        System.out.println(aNormalObj.getDiscount());
        System.out.println(aNormalObj.getBrand());
        System.out.println(aNormalObj.getMrp());

    }
}
