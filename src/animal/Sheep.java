package animal;

import base.Herbivores;

public class Sheep extends Herbivores {
    private final String image = "\uD83D\uDC11";
    String name = "Овца";

    @Override
    public void eat() {
        System.out.println(name + " поел травы");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Sheep(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
