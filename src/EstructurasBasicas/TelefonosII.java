package EstructurasBasicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TelefonosII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> contactos = new HashMap<>();

        rellenarContactos(contactos, scanner);

        ArrayList<String> telefonos = pedirContacto(contactos, scanner);

        System.out.println("Los números de teléfono son: " + telefonos);

        scanner.close();
    }

    public static void rellenarContactos(HashMap<String, ArrayList<String>> contactos, Scanner scanner) {
        System.out.println("Dime el número de contactos que quieres añadir: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        for (int i = 0; i < n; i++) {
            System.out.println("Cómo se llama el contacto?:");
            String contacto = scanner.next();

            ArrayList<String> telefonos = new ArrayList<>();

            System.out.println("Dime cuántos números de teléfono tiene el contacto: ");
            int j = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            for (int k = 0; k < j; k++) {
                System.out.println("Cuál es el número de teléfono de " + contacto + "?:");
                String numTelefono = scanner.next();
                telefonos.add(numTelefono);
            }

            // Agregar contacto y sus teléfonos al HashMap
            contactos.put(contacto, telefonos);
        }
    }

    public static ArrayList<String> pedirContacto(HashMap<String, ArrayList<String>> contactos, Scanner scanner) {
        String contacto;
        do {
            System.out.println("Dime el nombre de un contacto existente:");
            contacto = scanner.next();
        } while (!contactos.containsKey(contacto));

        return contactos.get(contacto); // Retornar la lista de teléfonos del contacto
    }
}
