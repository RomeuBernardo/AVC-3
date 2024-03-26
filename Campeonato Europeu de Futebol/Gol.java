/**
 * Representa um gol durante um jogo.
 */
class Gol extends Evento {
    private Jogador marcador;

    /**
     * Construtor para criar um novo gol marcado pelo jogador fornecido.
     * 
     * @param marcador O jogador que marcou o gol.
     * @param minuto O minuto em que o gol foi marcado.
     */
    public Gol(Jogador marcador, int minuto) {
        super(minuto);
        this.marcador = marcador;
    }

    /**
     * Obtém o jogador que marcou o gol.
     * 
     * @return O jogador que marcou o gol.
     */
    public Jogador getMarcador() {
        return marcador;
    }
}
