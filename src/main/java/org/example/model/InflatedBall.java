package org.example.model;

import org.example.decoratores.ToyDecorator;

public class InflatedBall extends ToyDecorator {
    public InflatedBall(Toy toy) {
        super(toy);
    }

    @Override
    public void produce() {
        decoratedToy.produce();
//        System.out.println("Inflating "+ decoratedToy.getName());
    }

    @Override
    public String getDescription() {
        return decoratedToy.getDescription() + ", bien gonflé";
    }
}
