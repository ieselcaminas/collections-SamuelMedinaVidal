package Flujos;

import java.util.ArrayList;

public class SumaPositivosNegativos {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(-10);
        lista.add(-20);
        lista.add(-30);
        lista.add(-50);
        lista.add(20);

        long numPositivos = lista.stream()
                .mapToInt(Integer::valueOf)
                .filter(numero -> numero > 0)
                .count();

        long numNegativos = lista.stream()
                .mapToInt(Integer::valueOf)
                .filter(numero -> numero < 0)
                .count();
    }
}
