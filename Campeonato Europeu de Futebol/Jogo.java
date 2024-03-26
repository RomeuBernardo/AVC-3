/**
 * Representa um jogo específico no campeonato.
 */
public class Jogo {
    private Equipa equipaCasa;
    private Equipa equipaVisitante;
    private List<Golo> golos;
    private List<Substituicao> substituicoes;
    private List<Cartao> cartoes;
    private EstatisticasExtra estatisticasExtra;

    /**
     * Construtor sem parâmetros.
     */
    public Jogo() {
        this.golos = new ArrayList<>();
        this.substituicoes = new ArrayList<>();
        this.cartoes = new ArrayList<>();
        this.estatisticasExtra = new EstatisticasExtra();
    }

    /**
     * Adiciona um gol ao jogo.
     * 
     * @param gol O gol a ser adicionado.
     */
    public void adicionarGol(Golo gol) {
        golos.add(gol);
    }

    /**
     * Adiciona uma substituição ao jogo.
     * 
     * @param substituicao A substituição a ser adicionada.
     */
    public void adicionarSubstituicao(Substituicao substituicao) {
        substituicoes.add(substituicao);
    }

    /**
     * Adiciona um cartão ao jogo.
     * 
     * @param cartao O cartão a ser adicionado.
     */
    public void adicionarCartao(Cartao cartao) {
        cartoes.add(cartao);
    }

    /**
     * Adiciona estatísticas adicionais ao jogo.
     * 
     * @param estatisticas As estatísticas adicionais a serem adicionadas.
     */
    public void adicionarEstatisticasAdicionais(EstatisticasExtra estatisticas) {
        this.estatisticasExtra = estatisticas;
    }

    /**
     * Obtém informações do jogo.
     * 
     * @return As informações do jogo.
     */
    public String obterInformacoesDoJogo() {
        // Implementação do método
        return "";
    }
}