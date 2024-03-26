/**
 * Representa um cartão durante um jogo.
 */
class Cartao extends Evento {
    private Jogador jogador;
    private String tipo; // amarelo ou vermelho

    public Cartao(Jogador jogador, String tipo, int minuto) {
        super(minuto);
        this.jogador = jogador;
        this.tipo = tipo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public String getTipo() {
        return tipo;
    }
}
