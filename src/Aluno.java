public class Aluno {
    private final String nome;
    private final String identificador;

    public Aluno(String nome, String identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() { return nome; }
    public String getIdentificador() { return identificador; }
}