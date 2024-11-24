package animal;

import base.Herbivores;

public class Caterpillar extends Herbivores {
    private final String image = "\uD83D\uDC1B";
    String name = "Гусеница";

    @Override
    public void eat() {
        System.out.println(name + " поела травы");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Caterpillar(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
