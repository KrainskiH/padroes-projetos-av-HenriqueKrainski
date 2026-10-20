import java.util.List;

public class PassagemRodoviaria extends Passagem {
    public PassagemRodoviaria(String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override public String getModal() { return "Rodoviário"; }
    @Override public double calcularTaxaEmbarque() { return getTarifa() * 0.03; }
    @Override public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto");
    }
}
