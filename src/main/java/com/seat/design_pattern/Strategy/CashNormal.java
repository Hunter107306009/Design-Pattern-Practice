package com.seat.design_pattern.Strategy;

public class CashNormal implements CashSuper{
    @Override
    public double acceptCash(double money){
        return money;
    }
}