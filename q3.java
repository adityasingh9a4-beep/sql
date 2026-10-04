import java.util.*;

class Fruit {
    void displayFruit() {
        System.out.println("This is a Fruit");
    }
}

class Apple extends Fruit {
    String name = "Apple";

    void displayApple() {
        System.out.println("Name: " + name);
    }
}

class TypeApple extends Apple {
    String type = "kashmiri";

    void displayType() {
        System.out.println("Type/Variety: " + type);
    }
}

public class q3 {
    public static void main(String[] args) {
        TypeApple a = new TypeApple();

        a.displayFruit();
        a.displayApple();
        a.displayType();
    }
}