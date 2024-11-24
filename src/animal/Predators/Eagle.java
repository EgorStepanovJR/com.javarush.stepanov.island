package animal.Predators;

import base.Predators;

public class Eagle extends Predators {
    private final String image = "\uD83E\uDD85";
    String name = "Орел";
    private final double weight = 6;
    private final int maxSpeed = 3;
    private double actualSatiety = 1;
    private int maxInCell = 20;

    public String getImage() {
        return image;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getActualSatiety() {
        return actualSatiety;
    }

    public int getMaxInCell() {
        return maxInCell;
    }
}
