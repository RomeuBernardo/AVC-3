/**
 * Representa uma equipe que participa do campeonato.
 */
public class Equipa {
    private String nome;
    private Jogador[] jogadores;
    private EstatisticasExtra estatisticas;

    /**
     * Construtor sem parâmetros.
     */
    public Equipa() {
        this.jogadores = new Jogador[10];
        this.estatisticas = new EstatisticasExtra();
    }

    /**
     * Adiciona um jogador à equipe.
     * 
     * @param jogador O jogador a ser adicionado.
     */
    public void adicionarJogador(Jogador jogador) {
    }

    /**
     * Adiciona estatísticas à equipe.
     * 
     * @param estatisticas As estatísticas a serem adicionadas.
     */
    public void adicionarEstatisticas(EstatisticasExtra estatisticas) {
        this.estatisticas = estatisticas;
    }

    /**
     * Obtém informações da equipe.
     * 
     * @return As informações da equipe.
     */
    public String obterInformacoesDaEquipe() {
        // Implementação do método
        return "";
    }
}