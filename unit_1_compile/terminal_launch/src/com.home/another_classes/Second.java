package com.home.another_classes;

import org.apache.commons.lang3.*;

public class Second {
    int a = 1;
    int b = 2;
    String str = ", SomeText, ";

    @Override
    public String toString() {
        return a + str + b;
    }

    public void start(){
        System.out.println(toString());
        System.out.println(StringUtils.upperCase(toString()));
    }
}