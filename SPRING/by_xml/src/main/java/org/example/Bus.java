package org.example;

public class Bus implements Vehicle {

    public Engine engine;
    public String modelName;
    public double cost;

    Bus(Engine engine){
        this.engine = engine;
    }
    Bus(){

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    // DI -> but we are injecting literal values    -> a double and a string    (also req to make getter as u can't access the properties)

    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    @Override
    public String getModelName(){
        return this.modelName;
    }

    public void setCost(double cost){
        this.cost = cost;
    }
    @Override
    public double getCost(){
        return this.cost;
    }




    @Override
    public String milage() {
        return "10 Km-pl";
    }

    @Override
    public String showEngine() {
        return engine.brand();
    }


}
