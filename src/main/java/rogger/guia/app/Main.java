package rogger.guia.app;

import rogger.guia.app.lambda.Calculadora;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Calculadora calculadora = new CalculadoraImpl();

        Calculadora calculadora = (opcion, val1, val2) -> {

            BigDecimal resultado = new BigDecimal("0.0");

            switch (opcion) {

                case "1":
                    resultado = val1.add(val2);
                    break;
                case "2":
                    resultado = val1.subtract(val2);
                    break;
                case "3":
                    resultado = val1.multiply(val2);
                    break;

            }

            return resultado;
        };

        Scanner sc = new Scanner(System.in);

        String opcion;
        BigDecimal val1;
        BigDecimal val2;

        System.out.println(
                "QUE OPERACION DESEAS HACER\n" +
                        "\t 1. SUMAR\n" +
                        "\t 2. RESTAR\n" +
                        "\t 3. MULTIPLICAR"
        );

        opcion = sc.nextLine();
        System.out.println("INGRESE PRIMER VALOR");
        val1 = sc.nextBigDecimal();
        System.out.println("INGRESE SEGUNDO VALOR");
        val2 = sc.nextBigDecimal();

        BigDecimal resultado = calculadora.operar(opcion, val1, val2);

        System.out.println("EL RESULTADO DE LA OPCION " + opcion + " ES: " + resultado);

    }
}