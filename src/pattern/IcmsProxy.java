package pattern;

import java.math.BigDecimal;
import modelo.Orcamento;

public class IcmsProxy implements CalculoPorRegiao{

    private CalculoPorRegiao calculoReal;

    public IcmsProxy(CalculoPorRegiao calculoReal){
        this.calculoReal = calculoReal;
    }

    @Override
    public BigDecimal

calculoPorRegiao(Orcamento orcamento) {
        System.out.println("LOG (Proxy): Calculando ICMS para o valor de " + orcamento.valor);

        return calculoReal.calculoPorRegiao(orcamento);
    }    
}
