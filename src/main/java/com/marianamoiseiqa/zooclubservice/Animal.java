package com.marianamoiseiqa.zooclubservice;

public abstract class Animal implements AnimalInterface {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
