public class EmissorFerroviario extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemFerroviaria(passageiro, tarifa);
    }
}
