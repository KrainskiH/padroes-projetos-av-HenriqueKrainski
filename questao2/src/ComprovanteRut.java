public class ComprovanteRut implements ComprovanteMatricula {
    private final Aluno aluno;
    private final String curso;

    public ComprovanteRut(Aluno aluno, String curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    @Override
    public String descrever() {
        return "Comprobante de matricula - " + aluno.getNome()
                + " (RUT " + aluno.getIdentificador() + ") no curso " + curso;
    }
}