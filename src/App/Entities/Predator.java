package App.Entities;

import App.Cell;
import App.Utils.AnimalEatProbability;
import App.Utils.ListUtils;
import App.Utils.LoadClass;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Predator extends Animal {

    public Predator(Cell cell) {
        super(cell);
        cell.addAnimal(this);
    }

    @Override
    public void eat() {

        ThreadLocalRandom random = ThreadLocalRandom.current();
        SplittableRandom random1 = new SplittableRandom(random.nextLong());
        Class<? extends Predator> clazz = this.getClass();
        String className = clazz.getSimpleName();
        //список возможных жертв

        //список жертв(объектов) в ячейке
        List<Animal> victimList = new ArrayList<>();
        //получаем список возможных жертв
        List<String> victimProbList = LoadClass.getMapPairs().get(className);
        Animal victim;
        //находим жертву в ячейке
        List<Animal> animalsCell = ListUtils.getAnimalsInCell(cell);
        //получаем список жертв, находящихся с хищником в одной ячейке
        for (Animal animal : animalsCell) {

            if (victimProbList.contains(animal.getClass().getSimpleName())) victimList.add(animal);
        }
        //может ли скушать? изменится если повезет поймать выбранную жертву.
        boolean canEat = false;
        if (!victimList.isEmpty()) {
            int max = victimList.size();

            int victimIndex = random1.nextInt(max);
            //фокус на рандомную цель, именно её будет пытаться съесть за один цикл
            victim = victimList.get(victimIndex);
            double chanceToEat = chanceToEatVictim(this, victim);
            canEat = random1.nextDouble(1.0) < chanceToEat;
            if (canEat && victim.isAlive) {
                //едим жертву
                victim.die();
                if (health < maxHealth) {
                    health++;
                }
            } else health --;

        } else {
            health--;
        }
    }

    private double chanceToEatVictim(Animal predator, Animal herbivore) {
        Class<? extends Animal> eater = predator.getClass();
        Class<? extends Animal> victim = herbivore.getClass();
        return AnimalEatProbability.getProbability(eater, victim);
    }
}
