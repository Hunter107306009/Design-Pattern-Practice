package com.seat.design_pattern.Observer;

public interface Debit{
    public void borrow(Credit credit);
    public void notifyCredit();
}
