package animal;

import base.Herbivores;

public class Horse extends Herbivores {
    private final String image = "\uD83D\uDC0E";
    String name = "Лошадь";

    @Override
    public void eat() {
        System.out.println(name + " поела травы");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Horse(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
