package EstructurasBasicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LaMejorTerminacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> boletos = new ArrayList<>();

        introducirBoletos(boletos, scanner);

        repeticionesTerminaciones(boletos);

        scanner.close();
    }
    public static void introducirBoletos(ArrayList<String> boletos, Scanner scanner) {
        System.out.println("Cuántos boletos quieres añadir?:");
        int valor = scanner.nextInt();

        for (int i = 0; i < valor; i++) {
            System.out.println("Dime el número del boleto: ");
            boletos.add(scanner.next());
        }
    }
    public static void repeticionesTerminaciones(ArrayList<String> boletos) {
        HashMap<Integer, Integer> terminaciones = new HashMap<>();
        for (String boleto: boletos) {
            int longitud = boleto.length();
            int ultimoNumero = Character.getNumericValue(boleto.charAt(longitud - 1));

            terminaciones.put(ultimoNumero, terminaciones.getOrDefault(ultimoNumero, 0) + 1);
        }
        System.out.println(terminaciones);
    }
}
