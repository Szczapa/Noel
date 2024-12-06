package org.example.observers;

import org.example.interfaces.IObserver;
import org.example.model.Toy;

import java.util.ArrayList;
import java.util.List;


public class EventManager {
    private final List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.notify(message);
        }
    }

    public void startProduction(Toy toy) {
        notifyObservers("Production started for: " + toy.getDescription());
        toy.produce();
        notifyObservers("Production completed for: " + toy.getDescription());
    }

}
