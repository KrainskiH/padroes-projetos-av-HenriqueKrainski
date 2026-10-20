public class BoletaElectronica implements DocumentoFiscal {
    private static final double IVA = 0.19;
    private final double valor;

    public BoletaElectronica(double valor) { this.valor = valor; }

    @Override
    public String descrever() {
        return String.format("Boleta electronica - valor CLP %.0f (IVA 19%%: CLP %.0f)", valor, valor * IVA);
    }
}