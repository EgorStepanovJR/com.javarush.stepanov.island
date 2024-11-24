package animal.Herbivores;

import base.Herbivores;

public class Buffalo extends Herbivores {
    private final String image = "\uD83D\uDC03";
    String name = "Буйвол";
    private final double weight = 700;
    private final int maxSpeed = 3;
    private double actualSatiety = 100;
    private int maxInCell = 10;

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
