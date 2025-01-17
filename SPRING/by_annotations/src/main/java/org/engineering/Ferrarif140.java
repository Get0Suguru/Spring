package org.engineering;

import org.springframework.stereotype.Component;

@Component
public class Ferrarif140 implements Engine{
    @Override
    public String getEngineBrand() {
        return "the engine is f140 by ferrari";
    }
}
