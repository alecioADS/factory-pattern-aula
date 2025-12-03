package pattern;

import java.math.BigDecimal;
import modelo.Orcamento;

public class SalvarNoBanco implements AcaoObserver {

    @Override
    public void executar(Orcamento orcamento, BigDecimal valorImposto) {
        System.out.println("OBSERVER: Salvando orçamento de " + orcamento.valor + " no banco de dados...");
    }
}