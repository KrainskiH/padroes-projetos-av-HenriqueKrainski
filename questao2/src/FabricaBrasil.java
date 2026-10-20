public class FabricaBrasil implements FabricaMatricula {
    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valor) { return new NotaFiscalNFSe(valor); }

    @Override
    public Pagamento criarPagamento(double valor) { return new PagamentoPix(valor); }

    @Override
    public ComprovanteMatricula criarComprovante(Aluno aluno, String curso) {
        return new ComprovanteCpf(aluno, curso);
    }
}
