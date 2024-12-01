package App;

import App.Utils.LoadClass;
import App.Utils.PlantsGenerator;
import App.Utils.StatClass;
import App.Utils.StepClass;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InterruptedException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("Симуляция острова запущена!");


        LoadClass loadClass = new LoadClass();
        LoadClass.PropertiesLoader.loadIslandConfig();
        LoadClass.InitializeClass.initialize();
        StatClass.printMap(Island.getInstance().getCells());
        Cell[][] cells = Island.getInstance().getCells();

        Thread thread = new Thread(new PlantsGenerator());
        thread.start();
        StepClass stepClass = new StepClass();

        stepClass.run();


    }
}
