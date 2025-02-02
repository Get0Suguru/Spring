package org.telusko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.telusko")
@PropertySource("car.properties")
public class Config {


    @Bean
    public Vehicle car(){
//        Car myCar = new Car();
//        return myCar;             or
        return new Car(discount());
    }

    @Bean
    public DiscountService discount(){
        return new DiscountService();
    }


}
