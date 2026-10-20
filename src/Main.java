public class Main {
    public static void main(String[] args) {
        Matricula brasil = new Matricula(
                new Aluno("Ana Souza", "123.456.789-09"),
                "Java Avançado", 500.00, new FabricaBrasil());
        brasil.confirmar();
        brasil.imprimirRelatorio();

        Matricula chile = new Matricula(
                new Aluno("Camila Rojas", "12.345.678-5"),
                "Java Avançado", 45000, new FabricaChile());
        chile.confirmar();
        chile.imprimirRelatorio();
    }
}
