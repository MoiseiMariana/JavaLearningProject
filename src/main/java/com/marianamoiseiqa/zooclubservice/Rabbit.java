package com.marianamoiseiqa.zooclubservice;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats the carrot and cabbage");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says kiii, kiii!");
    }


}


