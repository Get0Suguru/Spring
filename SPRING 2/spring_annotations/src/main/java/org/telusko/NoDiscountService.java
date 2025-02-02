package org.telusko;

import org.springframework.stereotype.Component;

@Component
public class NoDiscountService implements DiscountService{
    @Override
    public String giveDiscount() {
        return "no discount !!";
    }
}
