package org.engineering;

import org.springframework.stereotype.Component;

@Component
public class ColomboV12 implements Engine{
    @Override
    public String getEngineBrand() {
        return "v12 by ferrari";
    }
}
