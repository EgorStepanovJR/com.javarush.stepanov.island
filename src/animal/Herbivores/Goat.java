package animal.Herbivores;

import base.Herbivores;

public class Goat extends Herbivores {
    private final String image = "\uD83D\uDC10";
    String name = "Коза";
    private final double weight = 60;
    private final int maxSpeed = 4;
    private double actualSatiety = 0.15;
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
