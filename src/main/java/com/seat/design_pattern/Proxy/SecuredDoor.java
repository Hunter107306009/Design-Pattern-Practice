package com.seat.design_pattern.Proxy;

public class SecuredDoor extends Door{
    private Door door;

    public SecuredDoor(Door door){
        this.door=door;
    }

    @Override
    public void open() {
        System.out.println("請輸入密碼");
    }

    public void open(String password){
        if(authenticate(password)){
            door.open();
        }
        else{
            System.out.println("密碼錯誤，無法開門");
        }
    }
    private boolean authenticate(String password){
        return "***".equals(password);
    }

    @Override
    public void close(){
        door.close();
    }
}