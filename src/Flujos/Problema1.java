package Flujos;

import java.util.ArrayList;

public class Problema1 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();

        Person persona = new Person("Juan", "Peris", 2005);
        Person persona2 = new Person("Ana", "Martínez", 2009);
        Person persona3 = new Person("Alberto", "Chicote", 1960);
        Person persona4 = new Person("Marta", "Casas", 1958);

        personas.add(persona);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);


        long nacenAntesSetenta = personas.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();

        System.out.println(nacenAntesSetenta);
    }
}
