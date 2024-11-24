package animal.Predators;

import base.Predators;

public class Fox extends Predators {
    private final String image = "\uD83E\uDD8A";
    String name = "Лиса";
    private final double weight = 8;
    private final int maxSpeed = 2;
    private double actualSatiety = 2;
    private int maxInCell = 30;

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
