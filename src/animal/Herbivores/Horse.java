package animal.Herbivores;

import base.Herbivores;

public class Horse extends Herbivores {
    private final String image = "\uD83D\uDC0E";
    String name = "Лошадь";
    private final double weight = 400;
    private final int maxSpeed = 4;
    private double actualSatiety = 60;
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
