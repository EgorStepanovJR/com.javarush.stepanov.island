package animal;

import base.Herbivores;

public class Deer extends Herbivores {
    private final String image = "\uD83E\uDD8C";
    String name = "Олень";

    @Override
    public void eat() {
        System.out.println(name + " поел травы");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Deer(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
