/**
 * Creator do Factory Method.
 * O procedimento de emissão (criar, calcular, imprimir) existe só aqui e
 * conhece apenas a abstração Passagem.
 */
public abstract class EmissorPassagem {

    /** Factory Method: cada emissor concreto decide qual passagem criar. */
    protected abstract Passagem criarPassagem(String passageiro, double tarifa);

    /** Template do procedimento de emissão; não deve mudar com novos modais. */
    public final Passagem emitir(String passageiro, double tarifa) {
        Passagem passagem = criarPassagem(passageiro, tarifa);
        double taxa = passagem.calcularTaxaEmbarque();
        imprimirResumo(passagem, taxa);
        return passagem;
    }

    private void imprimirResumo(Passagem p, double taxa) {
        System.out.println("===== Resumo da Emissão =====");
        System.out.println("Modal: " + p.getModal());
        System.out.println("Passageiro: " + p.getPassageiro());
        System.out.printf("Taxa de embarque: R$ %.2f%n", taxa);
        System.out.println("Documentos exigidos: " + String.join("; ", p.getDocumentosExigidos()));
        System.out.println();
    }
}
