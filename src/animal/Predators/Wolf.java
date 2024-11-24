package animal.Predators;

import base.Predators;

public class Wolf extends Predators {
    private final String image = "\uD83D\uDC3A";
    String name = "Волк";
    private final double weight = 50;
    private final int maxSpeed = 3;
    private double actualSatiety = 8;
    private final int maxInCell = 30;

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
