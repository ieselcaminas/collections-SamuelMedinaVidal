package InterfazComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        Human h1 = new Human("Juan", 1200);
        Human h2 = new Human("Maria", 1500);
        Human h3 = new Human("Ana", 900);
        Human h4 = new Human("Paco", 2200);

        List<Human> humans = Arrays.asList(h1, h2, h3, h4);

        humans.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
