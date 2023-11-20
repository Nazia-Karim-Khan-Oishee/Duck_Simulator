package org.example;

public class Quackologist implements ObserverInterface {
    public void update(QuackObservable duck) {

        System.out.println("Quackologist: " + duck.toString() + " just quacked.");
    }
}