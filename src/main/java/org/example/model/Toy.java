package org.example.model;

import jdk.jfr.Description;

public abstract class Toy {
    private String name;
    private String description;

    public Toy(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public abstract void produce();
}
