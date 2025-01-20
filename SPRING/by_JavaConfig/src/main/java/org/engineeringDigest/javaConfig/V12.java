package org.engineeringDigest.javaConfig;

import org.springframework.stereotype.Component;


public class V12 implements Engine{

    @Override
    public String getEngineBrand() {
        return "v12 by ferrari";
    }
}
