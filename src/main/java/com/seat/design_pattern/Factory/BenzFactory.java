package com.seat.design_pattern.Factory;

public class BenzFactory implements CarFactory{
    @Override
    public Car buildACar(){
        System.out.println("工廠生產了一台Benz");
        return new Benz();
    }
}