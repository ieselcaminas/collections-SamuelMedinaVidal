package EstructurasBasicas;

import java.util.Scanner;
import java.util.Stack;

public class Paréntesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la oración: ");
        String oracion = scanner.nextLine();

        if (estaParentizada(oracion)) {
            System.out.println("Está bien parentizada.");
        } else {
            System.out.println("No está bien parentizada.");
        }

        scanner.close(); //Cerrar el Scanner
    }

    public static boolean estaParentizada(String oracion) {
        Stack<Character> pila = new Stack<>();

        //Recorremos toda la cadena
        for (int i = 0; i < oracion.length(); i++) {
            char c = oracion.charAt(i);

            //Si encontramos un carácter de apertura, lo agregamos a la pila
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            }
            //Si encontramos un carácter de cierre
            else if (c == ')' || c == '}' || c == ']') {
                //Si la pila está vacía, significa que hay un cierre sin apertura
                if (pila.isEmpty()) {
                    return false;
                }

                //Verificamos que coincida con la apertura correspondiente
                char apertura = pila.pop();
                if (!esCorrespondiente(apertura, c)) {
                    return false;
                }
            }
        }

        //Si la pila está vacía al final, la cadena está bien parentizada
        return pila.isEmpty();
    }

    //Método auxiliar para verificar si un cierre corresponde a su apertura
    private static boolean esCorrespondiente(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
                (apertura == '{' && cierre == '}') ||
                (apertura == '[' && cierre == ']');
    }
}
