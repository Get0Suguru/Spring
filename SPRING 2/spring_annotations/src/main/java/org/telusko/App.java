package org.telusko;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Vehicle aNormalObj = context.getBean("myCar", Vehicle.class);
        /*  concept of name of bean

        1. either the og name with first letter auto small
        2. add name after component annotation

         */

        System.out.println(aNormalObj.getMilage());
        System.out.println(aNormalObj.getDiscount());
        System.out.println(aNormalObj.getMrp());

        Vehicle bNormalObj = context.getBean("myCar", Vehicle.class);
        System.out.println(aNormalObj == bNormalObj);           // had to be false as prototype scope
    }
}
