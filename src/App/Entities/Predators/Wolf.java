package App.Entities.Predators;

import App.Cell;
import App.Entities.Predator;

public class Wolf extends Predator {


    private static int count = 0;

    public Wolf(Cell cell) {
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
        return "\uD83D\uDC3A";
    }

    public static String getImage() {
        return "\uD83D\uDC3A";
    }
}
