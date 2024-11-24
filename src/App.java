import animal.Bear;
import animal.Boa;
import animal.Buffalo;

public class App {
    public static void main(String[] args) {
        Bear bear = new Bear(500, 5, 80);
        Boa boa = new Boa(15, 1, 3);
        Buffalo buffalo = new Buffalo(700, 3, 100);

        boa.move();
        bear.move();
        buffalo.move();
        bear.eat(buffalo.getName());
    }
}
