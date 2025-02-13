package Flujos;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int n;
        int suma = 0;
        numeros.add(25);
        numeros.add(30);
        numeros.add(20);


//        for(int numero : numeros) {
//            int cuantos = 0;
//            n = numero;
//            suma += n;
//            if (n % 3 == 0){
//                cuantos++;
//            }
//        }
//        System.out.println("Hay " + cuantos + " números múltipolos de 3 y la media es de:" + (float)suma /(float)numeros.size());

        //Contamos los múltiples de 3
        long cuantos = numeros.stream()
                //Convertimos a Int
                .mapToInt(s -> Integer.valueOf(s))
                //filtramos los que sean múltiplos de 3
                .filter(number -> number % 3 == 0)
                //los contamos
                .count();

        //Calculamos la media
        double media = numeros.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Hay " + cuantos + " números múltiplos de 3 y la media es de " + media );
    }
}
