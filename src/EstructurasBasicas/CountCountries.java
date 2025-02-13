package EstructurasBasicas;

import java.io.*;
import java.util.HashMap;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> paises = new HashMap<>();

        String line;

        BufferedReader reader = new BufferedReader(new FileReader("/media/sammedvid/Nuevo vol/Instituto/Grado Superior/1ºDAW/Programación/Tema 5/Colfuturo-Seleccionados.csv"));

        //Recorremos las líneas hasta que no quede ninguna
        while((line = reader.readLine()) != null) {
            //Separamos las palabras de la línea en base a las ","
            String[] split = line.split(",");

            //Obtenemos el país de la línea, que es la posición 7 del array
            String pais = split[6];

            Integer alumnos = paises.get(pais);
            paises.put(pais, alumnos == null? 1: alumnos + 1);
        }
        for (String pais : paises.keySet()) {
            System.out.println(pais + ": " + paises.get(pais));
        }
    }
}
