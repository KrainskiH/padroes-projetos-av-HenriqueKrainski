public class Main {
    public static void main(String[] args) {
        // O cliente usa apenas a abstração EmissorPassagem:
        // não instancia passagens concretas nem usa if/switch.
        EmissorPassagem aereo = new EmissorAereo();
        EmissorPassagem rodoviario = new EmissorRodoviario();
        EmissorPassagem ferroviario = new EmissorFerroviario();

        aereo.emitir("Maria Silva", 1000.00);
        rodoviario.emitir("João Souza", 200.00);
        ferroviario.emitir("Ana Lima", 500.00);
    }
}
