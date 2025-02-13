package EstructurasBasicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> coches = new ArrayList<>();

        rellenarArrayList(coches, scanner);

        for (String coche : coches) {
            System.out.println(coche);
        }
    }

    public static void rellenarArrayList(ArrayList<String> coches, Scanner scanner) {
        //Bucle infinito en el cual añadimos a un String el coche y comprueba si el String está vacío o no para cerrar el bucle.
        while (true) {
            System.out.println("Dime un coche: ");
            String entrada = scanner.nextLine();

            if (entrada.isBlank()) {
                break;
            }

            coches.add(entrada);
        }
    }
}
