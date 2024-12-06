package org.example.model;

import org.example.decoratores.ToyDecorator;

public class CamoPistol extends ToyDecorator {
    public CamoPistol(Toy toy) {
        super(toy);
    }

    @Override
    public void produce() {
        decoratedToy.produce();
//        System.out.println("Adding paint to the " + decoratedToy.getName());
    }

    @Override
    public String getDescription() {
        return decoratedToy.getDescription() + ", avec un paintJob dessus";
    }

}
