package org.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// will make its bean with bean tag in config.class  (java's config)
public class Car implements Vehicle{


    private DiscountService discount;

    @Value("${pricyOfCar}")
    private Double mrp;

    //we will do constructor injection (challege to do di using java config)
    Car(DiscountService givenDiscount){
        this.discount = givenDiscount;
    }

    @Override
    public String getDiscount() {
        return discount.giveDiscount();
    }

    @Override
    public Double getMrp() {
        return this.mrp;
    }

    @Override
    public String getBrand() {
        return "Lexus";
    }

    @Override
    public String getMilage() {
        return "20 km-pl";
    }


}
