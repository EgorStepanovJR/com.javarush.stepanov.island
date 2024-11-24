package animal.Predators;

import base.Predators;

public class Boa extends Predators {
    private final String image = "\uD83D\uDC0D";
    String name = "Удав";
    private final double weight = 15;
    private final int maxSpeed = 1;
    private double actualSatiety = 3;
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
