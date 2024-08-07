package com.seat.design_pattern.Observer;
import java.util.List;
import java.util.ArrayList;

public class Debtor implements Debit{
    private List<Credit> allCredits=new ArrayList<>();
    private boolean balance=false;
    @Override
    public void borrow(Credit credit){
        allCredits.add(credit);
    }

    @Override
    public void notifyCredit(){
        allCredits.forEach(credit -> credit.takeMoney());
    }

}