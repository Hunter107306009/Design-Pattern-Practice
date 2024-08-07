package com.seat.design_pattern.Proxy;

public class LabDoor extends Door{
    @Override
    public void open(){
        System.out.println("打開LabDoor");
    }
    @Override
    public void close(){
        System.out.println("關上LabDoor");
    }
}