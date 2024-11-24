package animal.Predators;

import base.Predators;

public class Bear extends Predators {
    private final String image = "\uD83D\uDC3B";
    String name = "Медведь";
    private final double weight = 500;
    private final int maxSpeed = 5;
    private double actualSatiety = 80;
    private int maxInCell = 5;

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
