package App.Entities.Herbivores;

import App.Cell;
import App.Entities.Herbivore;

public class Horse extends Herbivore {

    private static int count = 0;

    public Horse(Cell cell) {
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
        return "\uD83D\uDC0E";
    }

    public static String getImage() {
        return "\uD83D\uDC0E";
    }
}
