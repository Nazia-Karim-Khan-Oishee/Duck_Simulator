package org.example;

import java.util.ArrayList;
import java.util.Iterator;


public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    QuackObservable duck;
    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public void registerObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            ObserverInterface observer = (ObserverInterface) iterator.next();
            observer.update(duck);
        }
    }
}