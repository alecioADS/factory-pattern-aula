package pattern;

import java.math.BigDecimal;
import modelo.Orcamento;

public class IcmsSP implements CalculoPorRegiao{

    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.valor.multiply(new BigDecimal("0.12"));
    }
}
