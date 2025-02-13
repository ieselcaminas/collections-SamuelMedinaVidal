package Flujos;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema4 {
public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    int num = 1;
    do{
        System.out.println("Introduzca un numero: ");
        num = sc.nextInt();
        lista.add(num);
    }while(num >= 0);

    lista.stream()
            .filter(valor -> valor >= 1 && valor <= 5)
            .forEach(System.out::println);
}
}
