import java.math.BigDecimal;
import modelo.Orcamento;
import pattern.CalculoPorRegiao;
import pattern.IcmsFactory;
import pattern.OrcamentoBuilder;

public class Teste {

    public static void main(String[] args) {

        // --- AQUI ESTÁ A MUDANÇA (PATTERN BUILDER) ---
        // Construindo o orçamento passo a passo de forma fluida
        Orcamento orcamento = new OrcamentoBuilder()
                .comValor(new BigDecimal("1000.00"))
                .comRegiao("ICMS_MG")
                .construir();

        // --- DAQUI PARA BAIXO SEGUE IGUAL (FACTORY + PROXY) ---
        IcmsFactory factory = new IcmsFactory();

        CalculoPorRegiao calculo = factory.getIcmsPorEstado("ICMS_MG");

        BigDecimal resultado = calculo.calculoPorRegiao(orcamento);

        System.out.println("O valor do ICMS é: " + resultado);
    }
}