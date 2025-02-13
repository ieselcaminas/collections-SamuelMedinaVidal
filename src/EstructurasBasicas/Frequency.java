package EstructurasBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> palabras = new HashMap<>();

        rellenarYContarPalabras(palabras, scanner);

        scanner.close();
    }
    public static void rellenarYContarPalabras(Map<String, Integer> palabras, Scanner scanner) {
        System.out.println("Introduce las palabras y cuando quieras parar, introduce un espacio vacío.");

        String palabra;

        do {
            System.out.println("Dime una palabra:");
            palabra = scanner.nextLine();

            if (!palabra.isEmpty()){
                palabras.put(palabra, palabras.getOrDefault(palabra, 0) + 1);
            }
        }while(!palabra.isEmpty());

        for (Map.Entry<String, Integer> entrada : palabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
