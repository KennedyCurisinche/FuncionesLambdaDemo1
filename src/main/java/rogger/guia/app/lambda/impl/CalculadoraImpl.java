package rogger.guia.app.lambda.impl;

import rogger.guia.app.lambda.Calculadora;

import java.math.BigDecimal;

public class CalculadoraImpl implements Calculadora {

    private BigDecimal resultado = new BigDecimal("0.0");

    @Override
    public BigDecimal operar(String opcion, BigDecimal val1, BigDecimal val2) {

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
    }

}
