package animal;

import base.Herbivores;

public class Goat extends Herbivores {
    private final String image = "\uD83D\uDC10";
    String name = "Коза";

    @Override
    public void eat() {
        System.out.println(name + " поела травы");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Goat(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
