package com.marianamoiseiqa.zooclubservice;

public class Fox extends Animal {
    public Fox(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats the chicken");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says hrrr, hrrr!");
    }

}


