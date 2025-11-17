import java.math.BigDecimal;
import modelo.Orcamento;
import pattern.CalculoPorRegiao;
import pattern.IcmsFactory;

public class Teste {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("1000.00"), "ICMS_MG");

        IcmsFactory factory = new IcmsFactory();

        CalculoPorRegiao calculo = factory.getIcmsPorEstado("ICMS_MG");

        BigDecimal resultado = calculo.calculoPorRegiao(orcamento);

        System.out.println("O valor do ICMS é: " + resultado);
    }
}
