package animal;

import base.Herbivores;

public class Rabbit extends Herbivores {
    private final String image = "\uD83D\uDC07";
    String name = "Кролик";

    @Override
    public void eat() {
        System.out.println(name + " поел травы");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Rabbit(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
