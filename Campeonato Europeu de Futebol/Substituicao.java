/**
 * Representa uma substituição durante um jogo.
 */
class Substituicao extends Evento {
    private Jogador jogadorSai;
    private Jogador jogadorEntra;

    public Substituicao(Jogador jogadorSai, Jogador jogadorEntra, int minuto) {
        super(minuto);
        this.jogadorSai = jogadorSai;
        this.jogadorEntra = jogadorEntra;
    }

    public Jogador getJogadorSai() {
        return jogadorSai;
    }

    public Jogador getJogadorEntra() {
        return jogadorEntra;
    }
}
