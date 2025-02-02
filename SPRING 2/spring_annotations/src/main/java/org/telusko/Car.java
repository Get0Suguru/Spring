package org.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myCar")
@Scope("prototype")
public class Car implements Vehicle{

    @Autowired
    @Qualifier("noDiscountService")
    private DiscountService discount;                           // give it value through injection of any 3

    @Value("${price}")
    private Double mrp;

//    constructor injection of bean festivalDiscountService
    /*
    autowired how it works -> visualize in terms of xml
    autowired go inside the DiscountService and match it with the beans list
    and as they will match with a bean of same type it will assign it  (as the bean is made by @Component)
     */
//    @Autowired
//    Car(DiscountService gotDiscount){
//        this.discount = gotDiscount;
//    }

//    @Autowired
//    public void setDiscount(DiscountService gotDiscount){
//        this.discount = gotDiscount;
//    }


    @Override
    public String getMilage() {
        return "20 km-pl";
    }

    @Override
    public String getDiscount() {
        return this.discount.giveDiscount();
    }

    @Override
    public Double getMrp() {
        return this.mrp;
    }

}
