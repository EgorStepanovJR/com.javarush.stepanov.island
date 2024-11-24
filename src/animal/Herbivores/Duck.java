package animal.Herbivores;

import base.Herbivores;

public class Duck extends Herbivores {
    private final String image = "\uD83E\uDD86";
    String name = "Утка";
    private final double weight = 1;
    private final int maxSpeed = 4;
    private double actualSatiety = 0.15;
    private int maxInCell = 200;

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
