
/**
 * Representa a implementação das estatísticas de uma equipe.
 */
public class EstatisticasEquipe implements  InterfaceEstatisticasEquipe {
    private int remates;
    private int livres;
    private int foraDeJogos;
    public EstatisticasEquipe(){}
    /**
     * Construtor para criar um objeto EstatisticasEquipeImpl com os valores fornecidos.
     * 
     * @param remates Número de remates da equipe.
     * @param livres Número de livres da equipe.
     * @param foraDeJogos Número de fora de jogos da equipe.
     */
    public EstatisticasEquipe(int remates, int livres, int foraDeJogos) {
        this.remates = remates;
        this.livres = livres;
        this.foraDeJogos = foraDeJogos;
    }

    /**
     * Obtém o número de remates da equipe.
     * 
     * @return O número de remates da equipe.
     */
    public int getRemates() {
        return remates;
    }

    /**
     * Obtém o número de livres da equipe.
     * 
     * @return O número de livres da equipe.
     */
    public int getLivres() {
        return livres;
    }

    /**
     * Obtém o número de fora de jogos da equipe.
     * 
     * @return O número de fora de jogos da equipe.
     */
    public int getForaDeJogos() {
        return foraDeJogos;
    }
}