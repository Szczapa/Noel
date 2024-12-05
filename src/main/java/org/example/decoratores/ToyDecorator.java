package org.example.decoratores;

import org.example.model.Toy;

public abstract class ToyDecorator extends Toy {
    protected Toy decoratedToy;

    public ToyDecorator(Toy toy) {
        super(toy.getName(), toy.getDescription());
        this.decoratedToy = toy;
    }

    @Override
    public abstract void produce();
}
