package animal;

import base.Herbivores;

public class Buffalo extends Herbivores {
    private final String image = "\uD83D\uDC03";
    String name = "Буйвол";

    @Override
    public void eat() {
        System.out.println(name + " поел травы");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    public Buffalo(double weight, int speedOfMovement, double fullySaturated) {
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
