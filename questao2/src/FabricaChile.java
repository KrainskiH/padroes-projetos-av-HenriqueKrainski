public class FabricaChile implements FabricaMatricula {
    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valor) { return new BoletaElectronica(valor); }

    @Override
    public Pagamento criarPagamento(double valor) { return new PagamentoWebpay(valor); }

    @Override
    public ComprovanteMatricula criarComprovante(Aluno aluno, String curso) {
        return new ComprovanteRut(aluno, curso);
    }
}
