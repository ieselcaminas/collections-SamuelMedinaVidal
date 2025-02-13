package Flujos;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Problema3 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();

        Person persona = new Person("Juan", "Peris", 2005);
        Person persona2 = new Person("Ana", "Martínez", 2009);
        Person persona3 = new Person("Alberto", "Chicote", 1960);
        Person persona4 = new Person("Marta", "Casas", 1958);
        Person persona5 = new Person("Juan", "Alberto", 2007);

        personas.add(persona);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        personas.stream()
                .map(Person::getFirstName)
                .distinct()
                .sorted()
                .forEach(valor -> System.out.println(valor));
    }
}
