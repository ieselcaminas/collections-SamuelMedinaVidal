package EstructurasBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> paises = new HashMap<String, String>();

        while (true) {
            System.out.println("Si quieres añadir países y ciudades pulsa 0, si quieres saber la capital de un país, pulsa 1, " +
                    "si quieres terminar el programa, pulsa cualquier otro número: ");
            int n = scanner.nextInt();
            if (n == 0) {
                addPais(paises, scanner);
            } else if (n == 1) {
                System.out.println(encontrarCapital(paises, scanner));
            } else {
                break;
            }
        }

        scanner.close();
    }

    public static void addPais(Map<String, String> paises, Scanner scanner) {
        System.out.println("Cuántos países quieres añadir?: ");
        int num = scanner.nextInt();
        String pais;
        String capital;

        for (int i = 0; i < num; i++) {
            do {
                System.out.println("Dime el nombre de un país no introducido: ");
                pais = scanner.next();
            } while (paises.containsKey(pais));
            System.out.println("Dime el nombre de su capital: ");
            capital = scanner.next();
            paises.put(pais, capital);
        }
    }

    public static String encontrarCapital(Map<String, String> paises, Scanner scanner) {
        String pais;
        do {
            System.out.println("Dime el nombre de un país almacenado y te diré su capital: ");
            pais = scanner.next();
        } while (!paises.containsKey(pais));


        return paises.get(pais);
    }
}
