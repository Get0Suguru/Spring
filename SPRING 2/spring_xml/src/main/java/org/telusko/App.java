package org.telusko;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        now do the work from context -> its ur link to the config file (made for ioc container's object creation)
        Vehicle aObject = context.getBean("myCurrentVehicle",Vehicle.class);       // format is -> getBean(passName, CastToWhatType)


        System.out.println(aObject.brandName());
        System.out.println(aObject.mileage() + "km-pl");
        System.out.println(aObject.getEngine());
        System.out.println(aObject.getDiscount());
        System.out.println(aObject.getMrp());
        

/*
//      example of prototype
        InsertEngine onlyEngine1 = context.getBean("engineKaObj", InsertEngine.class);
        InsertEngine onlyEngine2 = context.getBean("engineKaObj", InsertEngine.class);
        System.out.println(onlyEngine1 == onlyEngine2);

//        example of singleton
        festivalDiscount soloDiscount1 = context.getBean("discountKaObj", festivalDiscount.class);
        festivalDiscount soloDiscount2 = context.getBean("discountKaObj", festivalDiscount.class);
        System.out.println(soloDiscount1 == soloDiscount2);

 */
    }
}
