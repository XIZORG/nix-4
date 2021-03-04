package com.home;

import java.io.IOException;
import com.home.another_classes.Third;
import com.home.another_classes.Second;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        new Second().start();
        new Third().testWindow();
    }
}