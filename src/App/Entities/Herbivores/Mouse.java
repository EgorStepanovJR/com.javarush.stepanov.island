package App.Entities.Herbivores;

import App.Entities.Herbivore;
import App.Cell;

public class Mouse extends Herbivore {

    private static int count = 0;

    public Mouse(Cell cell) {
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
        return "\uD83D\uDC01";
    }

    public static String getImage() {
        return "\uD83D\uDC01";
    }
}
