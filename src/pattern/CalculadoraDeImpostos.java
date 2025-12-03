package pattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import modelo.Orcamento;

public class CalculadoraDeImpostos {

    // Lista de observadores (ações que serão executadas)
    private List<AcaoObserver> acoes = new ArrayList<>();

    // Método para adicionar observadores na lista
    public void adicionarAcao(AcaoObserver acao) {
        this.acoes.add(acao);
    }

    // Método que coordena tudo: Pede pra Factory, Calcula e Avisa os Observers
    public void calcular(Orcamento orcamento) {

        // 1. Usa a Factory para descobrir qual cálculo fazer (MG ou SP)
        // Note que o orcamento já tem a região dentro dele graças ao Builder
        IcmsFactory factory = new IcmsFactory();
        CalculoPorRegiao calculo = factory.getIcmsPorEstado(orcamento.icmsRegiao);

        // 2. Realiza o cálculo (isso vai passar pelo Proxy também!)
        BigDecimal resultado = calculo.calculoPorRegiao(orcamento);

        System.out.println("O valor do ICMS é: " + resultado);

        // 3. APLICAÇÃO DO PATTERN OBSERVER: Notifica todos os ouvintes
        System.out.println("--- Executando ações pós-cálculo ---");
        for (AcaoObserver acao : acoes) {
            acao.executar(orcamento, resultado);
        }
    }
}