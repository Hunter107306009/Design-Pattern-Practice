package com.seat.design_pattern.Observer;

public class Creditor implements Credit {
    public void takeMoney(){
        System.out.println("收到還款");
    }
}