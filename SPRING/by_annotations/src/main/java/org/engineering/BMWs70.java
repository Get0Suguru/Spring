package org.engineering;

import org.springframework.stereotype.Component;

@Component
public class BMWs70 implements Engine{

    @Override
    public String getEngineBrand(){
        return "its s70 from BMW";
    }
}
