package pattern;

public class IcmsFactory {

    public CalculoPorRegiao getIcmsPorEstado(String nomeEstado) {

        if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
            return new IcmsProxy (new IcmsMG());
        } else if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
            return new IcmsProxy (new IcmsSP());
        } else {
            System.out.println("Valor inválido - ICMS não cadastrado!");
            return null;
        }
    }
}
