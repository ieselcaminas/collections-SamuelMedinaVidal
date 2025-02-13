package EstructurasBasicas;

import java.util.ArrayList;
import java.util.Scanner;

public class RepartiendoRegalosEnTuCalle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> portales = new ArrayList<>();
        leerPortales(portales, scanner);

        scanner.close();

        System.out.println(seMueve(portales));
    }

    public static void leerPortales(ArrayList<Integer> portales, Scanner scanner) {
        System.out.println("Cuántos portales tiene tu calle?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dime el número del portal: ");
            portales.add(scanner.nextInt());
        }
    }

    public static String seMueve(ArrayList<Integer> portales) {

        int a = portales.get(0);
        portales.remove(0);

        String puertas = "";
        while (!portales.isEmpty()) {
            int masPequeño = Integer.MAX_VALUE;
            int b = -1;
            for (int i = 0; i < portales.size(); i++) {
                int resta = Math.abs(a - portales.get(i));
                if (resta < masPequeño) {
                    masPequeño = resta;
                    b = portales.get(i);
                } else if (resta == masPequeño) {
                    b = Math.max(b, portales.get(i));
                }
            }

            a = b;
            portales.remove(Integer.valueOf(b));
            puertas += b + " ";
        }

        return puertas.toString();
    }
}
