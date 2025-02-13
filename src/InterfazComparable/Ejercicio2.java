package InterfazComparable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Instituto\\Grado Superior\\1ºDAW\\Programación\\Tema 5\\illiterate.csv"));

        List<Pais> paises = new ArrayList<Pais>();
        Pais pais;
        String linea;
        String[] datos;

        br.readLine();
        while ((linea = br.readLine()) != null) {
            datos = linea.split(",");
            pais = new Pais(datos[5], Integer.parseInt(datos[8]));
            paises.add(pais);
        }

        paises.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
