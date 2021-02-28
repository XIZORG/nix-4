package com.home.another_classes;

public class Second {
    int a = 1;
    int b = 2;
    String str = ", SomeText, ";

    @Override
    public String toString() {
        return a + str + b;
    }
}