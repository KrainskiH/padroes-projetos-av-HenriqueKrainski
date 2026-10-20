public class NotaFiscalNFSe implements DocumentoFiscal {
    private static final double ISS = 0.05;
    private final double valor;

    public NotaFiscalNFSe(double valor) { this.valor = valor; }

    @Override
    public String descrever() {
        return String.format("NFS-e - valor R$ %.2f (ISS 5%%: R$ %.2f)", valor, valor * ISS);
    }
}