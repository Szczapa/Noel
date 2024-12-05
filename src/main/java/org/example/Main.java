package org.example;

import org.example.factories.BallFactory;
import org.example.factories.PistolFactory;
import org.example.factories.ToyFactory;
import org.example.interfaces.IObserver;
import org.example.model.CamoPistol;
import org.example.model.InflatedBall;
import org.example.model.Toy;
import org.example.observers.ElfNotify;
import org.example.observers.EventManager;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        ElfNotify elfNotify = new ElfNotify();
        eventManager.addObserver(elfNotify);

        ToyFactory ballFactory = new BallFactory();
        ToyFactory pistolFactory = new PistolFactory();

        Toy ball = ballFactory.createToy();
        eventManager.startProduction(ball);
        Toy inflateBall = new InflatedBall(ball);
        eventManager.startProduction(inflateBall);

        Toy pistol = pistolFactory.createToy();
        eventManager.startProduction(pistol);
        Toy camoPistol = new CamoPistol(pistol);
        eventManager.startProduction(camoPistol);


    }
}