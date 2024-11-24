package animal;

import base.Herbivores;

public class Mouse extends Herbivores {
    private final String image = "\uD83D\uDC01";
    String name = "Мышь";

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

    public Mouse(double weight, int speedOfMovement, double fullySaturated) {
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
