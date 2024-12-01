package App.Entities.Predators;

import App.Cell;
import App.Entities.Predator;

public class Eagle extends Predator {

    private static int count = 0;

    public Eagle(Cell cell) {
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
        return "\uD83E\uDD85";
    }

    public static String getImage() {
        return "\uD83E\uDD85";
    }
}
