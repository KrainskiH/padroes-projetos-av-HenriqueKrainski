public class EmissorRodoviario extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemRodoviaria(passageiro, tarifa);
    }
}
