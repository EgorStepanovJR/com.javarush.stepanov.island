package animal;

import base.Predators;

public class Wolf extends Predators {
    private final String image = "\uD83D\uDC3A";
    String name = "Волк";

    public void eat(Object o) {
        System.out.println(name + " съел " + o + "а");
    }

    @Override
    public void eat() {
        System.out.println(name + " поел");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Wolf(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
