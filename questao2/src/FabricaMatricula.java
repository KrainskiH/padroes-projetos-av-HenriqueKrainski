public interface FabricaMatricula {
    DocumentoFiscal criarDocumentoFiscal(double valor);
    Pagamento criarPagamento(double valor);
    ComprovanteMatricula criarComprovante(Aluno aluno, String curso);
}
