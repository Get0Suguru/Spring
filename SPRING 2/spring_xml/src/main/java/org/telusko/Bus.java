package org.telusko;

public class Bus implements Vehicle{

    // ab bc kare kya obj creation to externalize hai to ye data kaise aayega -> DI
    public InsertEngine engine;
    public festivalDiscount discount;
    public Double mrp;

    // constructor injection
    Bus(festivalDiscount discount){
        this.discount = discount;
    }

    // setter injection
    public void setEngine(InsertEngine engine){
        this.engine = engine;
    }

    @Override
    public int mileage() {
        return 10;
    }

    @Override
    public String brandName() {
        return "Ashok Lay-lands";
    }

    @Override
    public String getDiscount() {
        return discount.giveDiscount();
    }

    @Override
    public String getEngine() {
        return engine.reliability();
    }

    @Override
    public Double getMrp() {
        return this.mrp;
    }
}
