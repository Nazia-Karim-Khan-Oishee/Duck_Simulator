package org.example;

public interface QuackObservable {
    public void registerObserver(ObserverInterface observer);
    public void notifyObservers();
}