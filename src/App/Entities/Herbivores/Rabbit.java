package App.Entities.Herbivores;

import App.Cell;
import App.Entities.Herbivore;

public class Rabbit extends Herbivore {


    private static int count = 0;

    public Rabbit(Cell cell) {
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
        return "🐇";
    }

    public static String getImage() {
        return "🐇";
    }
}
