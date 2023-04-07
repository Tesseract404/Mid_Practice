package com.arnob.mid;

public class Dog {
    private String color ="Black";
    private String action =" ";

    public Dog(String color) {
        this.color = color;
    }
    public Dog() {
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setAction(String action) {
        this.action = action;
    }
//    public String printDog() {
//       return  color + " dog is "+ action;
//
//    }

    public void printDog() {
        System.out.println(color + " dog is "+ action);

    }
}
