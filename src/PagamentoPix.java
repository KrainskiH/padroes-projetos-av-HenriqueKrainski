public class PagamentoPix implements Pagamento {
    private final double valor;

    public PagamentoPix(double valor) { this.valor = valor; }

    @Override
    public String descrever() {
        return String.format("Pix - R$ %.2f", valor);
    }
}