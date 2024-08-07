package com.seat.design_pattern.Template;

public abstract class Cooking{
    protected abstract void step1();
    protected abstract void step2();
    public void cook(){
        System.out.println("做飯開始");
        step1();
        step2();
        System.out.println("做飯結束");
    }
}