import java.util.List;

public class PassagemFerroviaria extends Passagem {
    public PassagemFerroviaria(String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override public String getModal() { return "Ferroviário"; }
    @Override public double calcularTaxaEmbarque() { return getTarifa() * 0.05; }
    @Override public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Comprovante de reserva");
    }
}
