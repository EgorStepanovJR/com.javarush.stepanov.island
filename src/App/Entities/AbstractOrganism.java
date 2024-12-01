package App.Entities;

import App.Cell;

public abstract class AbstractOrganism {


    protected Cell cell;
    protected boolean isAlive;
    public AbstractOrganism(Cell cell) {
        this.cell = cell;
        isAlive = true;

    }

    public AbstractOrganism() {
        isAlive = true;
    }
    public Cell getCell() {
        return cell;
    }
}
