package App.Entities.Herbivores;

import App.Cell;
import App.Entities.Herbivore;

public class Sheep extends Herbivore {

    private static int count = 0;

    public Sheep(Cell cell) {
        super(cell);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void die() {
        super.die();
        count--;

    }

    @Override
    public String toString() {
        return "\uD83D\uDC11";
    }

    public static String getImage() {
        return "\uD83D\uDC11";
    }
}
