package EstructurasBasicas;

import java.util.*;

public class Botin {
    public static void main(String[] args) {
        Integer[] billetes = {10, 20, 50, 200, 500};
        Collections.shuffle(Arrays.asList(billetes)); // Barajamos los billetes
        System.out.println(repartirBilletes(2, billetes));
    }

    public static Map<Integer, List<Integer>> repartirBilletes(int participantes, Integer[] billetes) {
        // Mapa para almacenar el reparto de billetes
        Map<Integer, List<Integer>> reparto = new HashMap<>();

        // Inicializamos las listas vacías para cada participante
        for (int i = 0; i < participantes; i++) {
            reparto.put(i, new ArrayList<>());
        }

        // Repartimos los billetes utilizando el operador % para repartir circularmente
        for (int i = 0; i < billetes.length; i++) {
            int participante = i % participantes; // Reparto circular
            reparto.get(participante).add(billetes[i]); // Añadimos el billete al participante correspondiente
        }

        return reparto; // Devolvemos el mapa con el reparto
    }
}
