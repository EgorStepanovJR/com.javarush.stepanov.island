package animal.Herbivores;

import base.Herbivores;

public class Deer extends Herbivores {
    private final String image = "\uD83E\uDD8C";
    String name = "Олень";
    private final double weight = 300;
    private final int maxSpeed = 4;
    private double actualSatiety = 50;
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
