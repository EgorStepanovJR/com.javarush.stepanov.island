package animal;

import base.Predators;

public class Eagle extends Predators {
    private final String image = "\uD83E\uDD85";
    String name = "Орел";

    public void eat(Object o) {
        System.out.println(name + " съел " + o + "a");
    }

    @Override
    public void eat() {
        System.out.println(name + " поел");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Eagle(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
