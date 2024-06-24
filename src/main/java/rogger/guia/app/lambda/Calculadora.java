package rogger.guia.app.lambda;

import java.math.BigDecimal;
@FunctionalInterface
public interface Calculadora {

    BigDecimal operar(String opcion, BigDecimal val1, BigDecimal val2);

}
