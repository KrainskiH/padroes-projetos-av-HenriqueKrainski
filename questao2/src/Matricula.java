public class Matricula {
    private final Aluno aluno;
    private final String curso;
    private final double valor;
    private final FabricaMatricula fabrica;

    private DocumentoFiscal documentoFiscal;
    private Pagamento pagamento;
    private ComprovanteMatricula comprovante;

    public Matricula(Aluno aluno, String curso, double valor, FabricaMatricula fabrica) {
        this.aluno = aluno;
        this.curso = curso;
        this.valor = valor;
        this.fabrica = fabrica;
    }

    public void confirmar() {
        this.documentoFiscal = fabrica.criarDocumentoFiscal(valor);
        this.pagamento = fabrica.criarPagamento(valor);
        this.comprovante = fabrica.criarComprovante(aluno, curso);
    }

    public void imprimirRelatorio() {
        if (documentoFiscal == null) {
            throw new IllegalStateException("Matricula ainda nao confirmada");
        }
        System.out.println(" Relatorio de matricula");
        System.out.println("Documento fiscal: " + documentoFiscal.descrever());
        System.out.println("Pagamento:   " + pagamento.descrever());
        System.out.println("Comprovante: " + comprovante.descrever());
        System.out.println();
    }
}
