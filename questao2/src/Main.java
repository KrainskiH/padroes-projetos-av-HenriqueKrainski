public class Main {
    public static void main(String[] args) {
        EmissorPassagem aereo = new EmissorAereo();
        EmissorPassagem rodoviario = new EmissorRodoviario();
        EmissorPassagem ferroviario = new EmissorFerroviario();

        aereo.emitir("Jose Eduardo", 1000.00);
        rodoviario.emitir("Henrique Souza", 200.00);
        ferroviario.emitir("Lara Lima", 500.00);
    }
}
