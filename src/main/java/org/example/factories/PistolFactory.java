package org.example.factories;

import org.example.model.Pistol;
import org.example.model.Toy;

public class PistolFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new Pistol();
    }
}
