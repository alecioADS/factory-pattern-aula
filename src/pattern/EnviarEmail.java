package pattern;

import java.math.BigDecimal;
import modelo.Orcamento;

public class EnviarEmail implements AcaoObserver {

    @Override
    public void executar(Orcamento orcamento, BigDecimal valorImposto) {
        System.out.println("OBSERVER: Enviando e-mail com valor do imposto: " + valorImposto);
    }
}