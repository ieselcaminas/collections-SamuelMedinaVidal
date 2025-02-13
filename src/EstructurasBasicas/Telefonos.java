package EstructurasBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map <String, String> contactos = new HashMap<String, String>();

        rellenarContactos(contactos, scanner);

        String telefono = pedirContacto(contactos, scanner);

        System.out.println("El número de teléfono es: " + telefono);

        scanner.close();
    }
    public static void rellenarContactos (Map <String, String> contactos, Scanner scanner) {
        String contacto;
        String numTelefono;

        System.out.println("Dime el número de contactos que quieres añadir: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Cómo se llama el contacto?:");
            contacto = scanner.next();
            System.out.println("Cuál es el número de teléfono de " + contacto + "?:");
            numTelefono = scanner.next();
            contactos.put(contacto, numTelefono);
        }
    }
    public static String pedirContacto (Map <String, String> contactos, Scanner scanner) {
        String contacto = "";
        do{
            System.out.println("Dime el nombre de un contacto existente:");
            contacto = scanner.next();
        }while (!contactos.containsKey(contacto));

        return contactos.get(contacto);
    }
}
