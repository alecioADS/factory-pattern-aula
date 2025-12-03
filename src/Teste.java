import java.math.BigDecimal;
import modelo.Orcamento;
import pattern.CalculadoraDeImpostos;
import pattern.EnviarEmail;
import pattern.OrcamentoBuilder;
import pattern.SalvarNoBanco;

public class Teste {

    public static void main(String[] args) {

        // 1. Construindo o orçamento (Builder)
        Orcamento orcamento = new OrcamentoBuilder()
                .comValor(new BigDecimal("1000.00"))
                .comRegiao("ICMS_MG")
                .construir();

        // 2. Criando o gerenciador (Calculadora)
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        // 3. Adicionando os Observers (Ouvintes)
        calculadora.adicionarAcao(new SalvarNoBanco());
        calculadora.adicionarAcao(new EnviarEmail());

        // 4. Executando o processo
        // Isso vai disparar: Factory -> Proxy -> Cálculo -> Observers
        calculadora.calcular(orcamento);
    }
}