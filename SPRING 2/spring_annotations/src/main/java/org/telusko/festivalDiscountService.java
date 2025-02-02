package org.telusko;

import org.springframework.stereotype.Component;

@Component
public class festivalDiscountService implements DiscountService{

    @Override
    public String giveDiscount(){
        return "please contact our customer care team";
    }
}
