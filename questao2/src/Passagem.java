import java.util.List;

public abstract class Passagem {
    private final String passageiro;
    private final double tarifa;

    protected Passagem(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public String getPassageiro() { return passageiro; }
    public double getTarifa() { return tarifa; }

    public abstract String getModal();
    public abstract double calcularTaxaEmbarque();
    public abstract List<String> getDocumentosExigidos();
}
