package org.engineering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// new way of creating a bean
@Component
@Scope("prototype")
public class Car implements Vehicle{

   // DI using constructor and setter is same by Autowired

    // NOTED -> @Autowired will look for the bean and then inject that bean in the current one | make sure the bean is created by @Component
    @Autowired
    @Qualifier("colomboV12")              // when there are multiple options for autowired to get then use the Qualifier annotation
                                        // (in that case we have Colombov12 and BMWs70 and Ferrarif140 as options as component available now which bean to be used as DI

    public Engine myEngine;            // now that we generate a prob which engine to be used

    @Value("${car.mrp}")
    private int mrp;

//----------------------------------------------------------------------------------------------------------------------

//   @Autowired
//   public void setEngine(Engine engine){
//       this.myEngine = engine;
//   }
//   Car(Engine engine){
//       this.myEngine = engine;
//   }

   //-------------------------------------------------------------------------------------------------------------------

    public int getMrp(){
        return mrp;
    }

    @Override
    public String milage() {
        return "20 km-pl";
    }

    @Override
    public String getEngineBrand(){
        return this.myEngine.getEngineBrand();
    }
}
