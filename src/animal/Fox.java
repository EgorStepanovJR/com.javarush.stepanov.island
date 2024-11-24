package animal;

import base.Predators;

public class Fox extends Predators {
    private final String image = "\uD83E\uDD8A";
    String name = "Лиса";

    public void eat(Object o) {
        System.out.println(name + " съела " + o + "a");
    }

    @Override
    public void eat() {
        System.out.println(name + " поела");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Fox(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
