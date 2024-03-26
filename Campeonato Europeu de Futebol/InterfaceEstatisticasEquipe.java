/**
 * Author: Romeu Bernardo
 * Interface para as estatísticas de uma equipe.
 */
public interface InterfaceEstatisticasEquipe {
    /**
     * Obtém o número de remates da equipe.
     * 
     * @return O número de remates da equipe.
     */
    int getRemates();

    /**
     * Obtém o número de livres da equipe.
     * 
     * @return O número de livres da equipe.
     */
    int getLivres();

    /**
     * Obtém o número de fora de jogos da equipe.
     * 
     * @return O número de fora de jogos da equipe.
     */
    int getForaDeJogos();
}
