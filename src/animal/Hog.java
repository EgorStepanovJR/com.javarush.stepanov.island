package animal;

import base.Herbivores;

public class Hog extends Herbivores {
    private final String image = "\uD83D\uDC17";
    String name = "Кабан";

    public void eat(Object o) {
        System.out.println(name + " съел " + o + "a");
    }

    @Override
    public void eat() {
        System.out.println(name + " поел");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Hog(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }
}
