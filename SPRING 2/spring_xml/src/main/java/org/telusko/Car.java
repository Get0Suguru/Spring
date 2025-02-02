package org.telusko;

public class Car implements Vehicle{

    public InsertEngine engine;
    public festivalDiscount discount;
    public Double mrp;                                  // will magically got the value through injection
    // || note setters are not mandatory but still its not working without setter even being public (confirmed from gpt)

// constructor injection
    Car(festivalDiscount discount){
        this.discount = discount;
    }

// setter injection
    public void setEngine(InsertEngine engine){
        this.engine = engine;
    }

    public void setMrp(Double mrp){
        this.mrp = mrp;
    }


    @Override
    public String getDiscount(){
        return discount.giveDiscount();
    }

    @Override
    public String getEngine(){
        return engine.performance();
    }

    @Override
    public Double getMrp() {
        return this.mrp;
    }


    @Override
    public int mileage() {
        return 20;
    }

    @Override
    public String brandName() {
        return "Lexus";
    }
}
