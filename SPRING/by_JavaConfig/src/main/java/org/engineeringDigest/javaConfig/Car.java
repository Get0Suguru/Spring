package org.engineeringDigest.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Car implements Vehicle{

    // so the field injection won't work without annotation so constructor injection

    @Value("${car.mrp}")
    private int mrpOfCar;           // had to use getter if had to access a private

    public Engine engine;

    // construtor to set
    Car(Engine engine){
        this.engine = engine;
    }

    @Override
    public String startEngine() {
        return engine.getEngineBrand() + " is starting";
    }

    @Override
    public int getMrpOfVehicle(){
        return this.mrpOfCar;
    }
}
