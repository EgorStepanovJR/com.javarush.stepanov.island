package animal;

import base.Predators;

public class Bear extends Predators {
    private final String image = "\uD83D\uDC3B";
    String name = "Медведь";

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

    public Bear(double weight, int speedOfMovement, double fullySaturated) {
        super(weight, speedOfMovement, fullySaturated);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
