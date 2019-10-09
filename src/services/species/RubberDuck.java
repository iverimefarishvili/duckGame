package services.species;

import services.Duck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i am rubber duck");
    }
    public void fly() {
        System.out.println("i can't fly!");

    }
}
