package com.arnob.mid;

public class Lion extends animal{
    public Lion() {
    }
    @Override
    public void food() {
        //super.food();
        System.out.println("Lions eate flesh.");
    }
    @Override
    public int getK() {
        return super.getK();
    }
    @Override
    public void setK(int k) {
        super.setK(5);
    }
}
