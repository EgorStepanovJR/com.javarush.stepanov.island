package animal;

import base.Predators;

public class Boa extends Predators {
    private final String image = "\uD83D\uDC0D";
    String name = "Удав";

    public void eat(Object o) {
        System.out.println(name + " съел " + o + "");
    }

    @Override
    public void eat() {
        System.out.println(name + " поел");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Boa(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
