public class PagamentoWebpay implements Pagamento {
    private final double valor;

    public PagamentoWebpay(double valor) { this.valor = valor; }

    @Override
    public String descrever() {
        return String.format("Webpay - CLP %.0f", valor);
    }
}
