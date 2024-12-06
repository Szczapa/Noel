package org.example.factories;

import org.example.model.Ball;
import org.example.model.Toy;

public class BallFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new Ball();
    }
}
