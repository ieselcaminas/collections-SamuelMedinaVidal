package EstructurasBasicas;

import java.io.*;
import java.util.*;
import java.util.HashMap;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/media/sammedvid/Nuevo vol/Instituto/Grado Superior/1ºDAW/Programación/Tema 5/spanish-dict.txt"));

        HashMap<String, ArrayList<String>> anagramas = new HashMap();

        String line;
        while ((line = reader.readLine())!=null) {
            //Almacenamos la palabra alfabetizada
            String alfabetizada = alphabetize(line);

            //Si la clave no existe, inicializa una nueva lista
            anagramas.putIfAbsent(alfabetizada, new ArrayList<>());

            //Añade la palabra original a la lista con la clave de la palabra alfabetizada
            anagramas.get(alfabetizada).add(line);
        }

        imprimirResultados(anagramas);

        reader.close();
    }
    private static String alphabetize(String s) {
        //Pasa la palabra a carácteres
        char[] a = s.toCharArray();

        //Los ordena alfabéticamente
        Arrays.sort(a);

        return new String(a);
    }
    public static void imprimirResultados(HashMap<String, ArrayList<String>> anagramas) {
        for (Map.Entry<String, ArrayList<String>> entry : anagramas.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ". Valores: " + entry.getValue());
        }
    }
}
