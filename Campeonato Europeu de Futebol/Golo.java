import java.util.Objects;

/**
 * Representa um golo durante um jogo.
 */
public class Golo extends Evento {
    private Jogador marcador;

    /**
     * Construtor para criar um novo golo marcado pelo jogador fornecido.
     * 
     * @param marcador O jogador que marcou o golo.
     * @param minuto O minuto em que o golo foi marcado.
     */
    public Golo(Jogador marcador, int minuto) {
        super(minuto);
        this.marcador = Objects.requireNonNull(marcador, "O marcador do golo não pode ser nulo.");
    }

    /**
     * Obtém o jogador que marcou o golo.
     * 
     * @return O jogador que marcou o golo.
     */
    public Jogador getMarcador() {
        return marcador;
    }
}
