package App.Utils;

import App.Cell;
import App.Entities.Animal;
import App.Entities.Herbivores.*;
import App.Entities.Predators.*;

public class StatClass {

    private static int countEntity = 0;



    public static void printMap(Cell[][] cells) {
        System.out.println("В каждой ячейке слева - количество травоядных, справа - хищников");

        for (int x = 0; x < cells[0].length; x++) { // Перебираем по столбцам (X)
            for (int y = 0; y < cells.length; y++) { // Перебираем по строкам (Y)
                System.out.print("| " + cells[y][x].getHerbivoreCount() + "|" + cells[y][x].getPredatorCount() + " |");
            }
            System.out.println();
        }
        System.out.println(Wolf.getImage() + Wolf.getCount() +
                Snake.getImage() + Snake.getCount() +
                Fox.getImage() + Fox.getCount() +
                Eagle.getImage() + Eagle.getCount() +
                Bear.getImage() + Bear.getCount() +
                Sheep.getImage() + Sheep.getCount() +
                Rabbit.getImage() + Rabbit.getCount() +
                Horse.getImage() + Horse.getCount() +
                Mouse.getImage() + Mouse.getCount() +
                Goat.getImage() + Goat.getCount() +
                Duck.getImage() + Duck.getCount() +
                Deer.getImage() + Deer.getCount() +
                Caterpillar.getImage() + Caterpillar.getCount() +
                Buffalo.getImage() + Buffalo.getCount() +
                Boar.getImage() + Boar.getCount() + "\n" +

                "Животных на карте: " + Animal.getCount()

                +"\nДень: " + StepClass.getTickCount());

        System.out.println("Среднее кол-во травы в ячейках: " + PlantsGenerator.getPlantCount());

        System.out.println("-------------------------------------------------------\n");
    }

}
