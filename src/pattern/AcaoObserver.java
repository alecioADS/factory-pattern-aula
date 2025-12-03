package pattern;

import java.math.BigDecimal;
import modelo.Orcamento;

public interface AcaoObserver {
    // O método que será disparado quando o evento acontecer
    void executar(Orcamento orcamento, BigDecimal valorImposto);
}