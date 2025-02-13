package EstructurasBasicas;

import java.util.Scanner;
import java.util.Stack;

public class ExpresionesAritméticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> expresion = new Stack<>();

        System.out.println("Introduce tu sentencia: ");
        String sentencia = scanner.nextLine();

        try {
            int resultado = evaluarExpresion(sentencia, expresion);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    public static int evaluarExpresion(String sentencia, Stack<Integer> expresion) {
        String[] split = sentencia.split(" ");

        for (String elemento : split) {
            if (elemento.matches("[+*/-]")){
                int operando2 = expresion.pop();
                int operando1 = expresion.pop();
                int calculo = 0;

                switch (elemento) {
                    case "+":
                        calculo = operando1 + operando2;
                        break;
                    case "-":
                        calculo = operando1 - operando2;
                        break;
                    case "*":
                        calculo = operando1 * operando2;
                        break;
                    case "/":
                        if (operando2 == 0) {
                            throw new ArithmeticException("División por cero.");
                        }
                        calculo = operando1 / operando2;
                        break;
                }
                expresion.push(calculo);
            } else {
                expresion.push(Integer.parseInt(elemento));
            }
        }

        if (expresion.size() != 1) {
            throw new IllegalArgumentException("Expresión inválida. Sobran operandos.");
        }

        return expresion.pop();
    }
}
