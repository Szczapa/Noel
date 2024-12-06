package org.example.model;

public abstract class Toy {
    private final String name;
    private String description;

    public Toy(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void produce();
}
