public class EmissorAereo extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemAerea(passageiro, tarifa);
    }
}
