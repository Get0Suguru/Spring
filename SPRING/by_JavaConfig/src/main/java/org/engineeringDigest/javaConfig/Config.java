package org.engineeringDigest.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.engineeringDigest.javaConfig")

@PropertySource("car.properties")       // to have properties simple af use the shit u used like in xml


public class Config {

    // remember making someone bean puts u under the power of ioc container mean (u can get stuff from it)
    @Bean
    public Vehicle myCar(){
        Car car = new Car(myEng());         // that's passing dependent bean through constructor without using the Autowired annotation
        return car;
    }

    @Bean
    public Engine myEng(){
        Engine v12 = new V12();
        return v12;
    }


}
