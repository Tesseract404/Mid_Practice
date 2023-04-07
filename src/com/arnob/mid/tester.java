package com.arnob.mid;

public class tester {
    public static void main(String[] args) {

        Dog scooby = new Dog();
        scooby.setAction("Barking");
        scooby.printDog();
        Dog odie = new Dog ("Red");
        odie.setAction("Sitting");
        odie.printDog();
        Dog goofy = new Dog("Blue");
        goofy.setAction("Eating");
        goofy.printDog();
        scooby.setColor("Brown");
        scooby.printDog();


        animal A = new animal();
        A.i=9;
        A.j=10;
        A.j=A.i+3;
            A.food();
            animal L = new Lion();
            L.food();
    }
}
