package com.seat.design_pattern.Factory;
public class BMWFactory implements CarFactory{
    @Override
    public Car buildACar(){
        System.out.println("工廠生產了一台BMW");
        return new BMW();
    }
}