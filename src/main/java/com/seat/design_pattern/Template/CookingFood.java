package com.seat.design_pattern.Template;

public class CookingFood extends Cooking{
    @Override
    protected void step1(){
        System.out.println("切菜");
    }
    @Override
    protected void step2(){
        System.out.println("下鍋");
    }
}