package com.home.another_classes;

import org.apache.commons.lang3.*;

public class Third {
    public void start(){
        Second sec = new Second();
        System.out.println(sec.toString());
        System.out.println(StringUtils.upperCase(sec.toString()));
    }
}