package pattern;

import java.math.BigDecimal;
import modelo.Orcamento;

public class OrcamentoBuilder {

    // Variáveis temporárias para guardar os dados antes de criar o objeto
    private BigDecimal valor;
    private String regiao;

    // Define o valor e retorna o próprio Builder (para encadear chamadas)
    public OrcamentoBuilder comValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    // Define a região e retorna o próprio Builder
    public OrcamentoBuilder comRegiao(String regiao) {
        this.regiao = regiao;
        return this;
    }

    // O método final que constrói o objeto Orcamento
    public Orcamento construir() {
        return new Orcamento(valor, regiao);
    }
}