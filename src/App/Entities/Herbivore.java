package App.Entities;

import App.Cell;

public abstract class Herbivore extends Animal {

    public Herbivore(Cell cell) {
        super(cell);
        cell.addAnimal(this);

    }

    @Override
    public void eat() {
        synchronized (cell.lock) {
//        cell.getPlants().remove(0);
            if (!cell.getPlants().isEmpty()) {
                Plant toEat = cell.getPlants().get(0);
                toEat.die();
                cell.getPlants().remove(toEat);
                health++;
            } else health--;
        }
    }
}
