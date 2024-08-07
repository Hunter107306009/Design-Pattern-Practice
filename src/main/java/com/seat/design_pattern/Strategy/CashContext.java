package com.seat.design_pattern.Strategy;

public class CashContext{
    private CashSuper cs;
    private TYPE t;
    public CashContext(TYPE t){
        switch(t){
            case NORMAL:
                cs=new CashNormal();
                break;
            case CASH_DISCOUNT:
                cs=new CashDiscount(0.8);
                break;
            case CASH_RETURN:
                cs=new CashReturn(300,100);
                break;
        }
    }
    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}