package InterfazComparable.FelipeYSusTareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFelipe {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();

        Tarea tarea = new Tarea(1, 50);
        Tarea tarea2 = new Tarea(2, 50);
        Tarea tarea3 = new Tarea(3, 200);
        Tarea tarea4 = new Tarea(1, 200);
        Tarea tarea5 = new Tarea(2, 20);

        tareas.add(tarea);
        tareas.add(tarea2);
        tareas.add(tarea3);
        tareas.add(tarea4);
        tareas.add(tarea5);

        tareas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
