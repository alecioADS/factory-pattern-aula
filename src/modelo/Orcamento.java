package modelo;

import java.math.BigDecimal;

public class Orcamento {

    public BigDecimal valor;
    public String icmsRegiao;

    public Orcamento(BigDecimal valor, String icmsRegiao) {
        this.valor = valor;
        this.icmsRegiao = icmsRegiao;
    }
}
