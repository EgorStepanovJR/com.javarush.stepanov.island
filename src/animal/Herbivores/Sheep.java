package animal.Herbivores;

import base.Herbivores;

public class Sheep extends Herbivores {
    private final String image = "\uD83D\uDC11";
    String name = "Овца";
    private final double weight = 70;
    private final int maxSpeed = 3;
    private double actualSatiety = 15;
    private int maxInCell = 140;

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
