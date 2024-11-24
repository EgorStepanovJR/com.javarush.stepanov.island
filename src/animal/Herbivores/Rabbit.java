package animal.Herbivores;

import base.Herbivores;

public class Rabbit extends Herbivores {
    private final String image = "\uD83D\uDC07";
    String name = "Кролик";
    private final double weight = 2;
    private final int maxSpeed = 2;
    private double actualSatiety = 0.45;
    private int maxInCell = 150;

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
