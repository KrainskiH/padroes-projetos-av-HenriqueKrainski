public class ComprovanteCpf implements ComprovanteMatricula {
    private final Aluno aluno;
    private final String curso;

    public ComprovanteCpf(Aluno aluno, String curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    @Override
    public String descrever() {
        return "Comprovante de matricula - " + aluno.getNome()
                + " (CPF " + aluno.getIdentificador() + ") no curso " + curso;
    }
}