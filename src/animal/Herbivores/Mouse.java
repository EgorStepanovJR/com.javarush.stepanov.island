package animal.Herbivores;

import base.Herbivores;

public class Mouse extends Herbivores {
    private final String image = "\uD83D\uDC01";
    String name = "Мышь";
    private final double weight = 0.5;
    private final int maxSpeed = 1;
    private double actualSatiety = 0.01;
    private int maxInCell = 500;

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
