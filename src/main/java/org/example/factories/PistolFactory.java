package org.example.factories;

import org.example.model.Toy;
import org.example.model.Pistol;

public class PistolFactory extends ToyFactory{
    @Override
    public Toy createToy() {
        return new Pistol();
    }
}
