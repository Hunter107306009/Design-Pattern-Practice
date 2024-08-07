package com.seat.design_pattern.Singleton;

import org.springframework.stereotype.Component;

@Component
public class Singleton{

    private static final Singleton instance=new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}