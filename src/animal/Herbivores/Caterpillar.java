package animal.Herbivores;

import base.Herbivores;

public class Caterpillar extends Herbivores {
    private final String image = "\uD83D\uDC1B";
    String name = "Гусеница";
    private final double weight = 0.01;
    private final int maxSpeed = 0;
    private double actualSatiety = 0;
    private int maxInCell = 1000;

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
