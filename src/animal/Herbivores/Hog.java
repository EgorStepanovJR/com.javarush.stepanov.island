package animal.Herbivores;

import base.Herbivores;

public class Hog extends Herbivores {
    private final String image = "\uD83D\uDC17";
    String name = "Кабан";
    private final double weight = 400;
    private final int maxSpeed = 2;
    private double actualSatiety = 50;
    private int maxInCell = 50;

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
