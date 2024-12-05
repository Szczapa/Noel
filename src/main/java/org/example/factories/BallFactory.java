package org.example.factories;

import org.example.model.Toy;
import org.example.model.Ball;

public class BallFactory extends ToyFactory{
   @Override
    public Toy createToy() {
       return new Ball();
   }
}
