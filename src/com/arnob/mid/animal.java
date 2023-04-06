package com.arnob.mid;

public class animal {
    int i  ,j  ;
    private int k;
    public animal() {
    }
    public int getK() {
        return k;
    }
    public void setK(int k) {
        this.k = k;
    }
    public void food(){
        System.out.println("What kinda food lions eat?"+i+" "+j);
    }
}
