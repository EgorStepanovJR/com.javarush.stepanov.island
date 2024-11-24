package animal;

import base.Herbivores;

public class Duck extends Herbivores {
    private final String image = "\uD83E\uDD86";
    String name = "Утка";

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

    public Duck(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
