package EstructurasBasicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> alturas = new ArrayList<>();

        leerAlturas(alturas, numAlumnos(scanner), scanner);

        double media = calcularMedia(alturas);

        mostrarResultados(alturas, media);
    }
    public static int numAlumnos (Scanner scanner){
        System.out.println("Dime el número de alumnos con el que mediremos alturas: ");
        return scanner.nextInt();
    }
    public static void leerAlturas (ArrayList<Double> alturas, int nAlumnos, Scanner scanner){
        for (int i = 0; i < nAlumnos; i++) {
            System.out.println("Dime la altura del alumno " + i + ": ");
            alturas.add(scanner.nextDouble());
        }
    }
    public static double calcularMedia (ArrayList<Double> alturas){
        double media = 0;

        for (double altura : alturas) {
            media += altura;
        }

        return media / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior (ArrayList<Double> alturas, double media){
        int superioresMedia = 0;
        for (double altura : alturas) {
            if (altura > media) {
                superioresMedia++;
            }
        }
        return superioresMedia;
    }
    public static int calcularAlumnosAlturaInfierior (ArrayList<Double> alturas, double media){
        int inferioresMedia = 0;
        for (double altura : alturas) {
            if (altura < media) {
                inferioresMedia++;
            }
        }
        return inferioresMedia;
    }
    public static void mostrarResultados (ArrayList<Double> alturas, double media){
        for (Double altura : alturas) {
            System.out.println(altura);
        }

        System.out.println("La media de alturas es: " + media);

        System.out.println("Hay un total de " + calcularAlumnosAlturaSuperior(alturas, media)
                + " alumnos superiores a la media.");

        System.out.println("Hay un total de " + calcularAlumnosAlturaInfierior(alturas, media)
                + " alumnos infierores a la media.");

    }
}
