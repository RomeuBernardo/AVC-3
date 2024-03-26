
/**
 * Representa um jogador que faz parte de uma equipe.
 */
public class Jogador {
    private String nome;
    private String posicao;
    private EstatisticasIndividuais estatisticasIndividuais;

    /**
     * Construtor sem parâmetros.
     */
    public Jogador() {
    }

    /**
     * Atualiza as estatísticas individuais do jogador.
     * 
     * @param estatisticas As novas estatísticas individuais.
     */
    public void atualizarEstatisticas(EstatisticasIndividuais estatisticas) {
        this.estatisticasIndividuais = estatisticas;
    }

    /**
     * Obtém informações do jogador.
     * 
     * @return As informações do jogador.
     */
    public String obterInformacoesDoJogador() {
        // Implementação do método
        return "";
    }
}
