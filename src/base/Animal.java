package base;

public abstract class Animal {
    double weight;
    int speedOfMovement;
    double fullySaturated;
    int populationInCell;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void setSpeedOfMovement(int speedOfMovement) {
        this.speedOfMovement = speedOfMovement;
    }

    public double getFullySaturated() {
        return fullySaturated;
    }

    public void setFullySaturated(double fullySaturated) {
        this.fullySaturated = fullySaturated;
    }

    public int getPopulationInCell() {
        return populationInCell;
    }

    public void setPopulationInCell(int populationInCell) {
        this.populationInCell = populationInCell;
    }

    public void eat() {
        System.out.println(name + " поел травы");
    }

    public void move() {
        System.out.println(name + " двигается");
    }
}
