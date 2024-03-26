/**
 * Author: Romeu Bernaardo
 * Classe que representa uma empresa de gestão de condomínios.
 */
public class EmpresaDeGestao {
    private Edificio edificios[]; // Lista de edifícios gerenciados pela empresa

    /**
     * Construtor padrão da classe EmpresaDeGestao.
     */
    public EmpresaDeGestao() {}

    /**
     * Obtém a lista de edifícios gerenciados pela empresa.
     * @return A lista de edifícios gerenciados pela empresa.
     */
    public Edificio[] getEdificios() {
        return this.edificios;
    }

    /**
     * Define a lista de edifícios gerenciados pela empresa.
     * @param edificios A lista de edifícios gerenciados pela empresa.
     */
    public void setEdificios(Edificio[] edificios) {
        this.edificios = edificios;
    }

    /**
     * Adiciona um edifício à lista de edifícios gerenciados pela empresa.
     * @param edificio O edifício a ser adicionado.
     */
    public void adicionarEdificio(Edificio edificio) {
        // Implementação para adicionar um edifício à lista de edifícios
    }

    /**
     * Remove um edifício da lista de edifícios gerenciados pela empresa.
     * @param edificio O edifício a ser removido.
     */
    public void removerEdificio(Edificio edificio) {
        // Implementação para remover um edifício da lista de edifícios
        
    }

    /**
     * Emite os balancetes dos condôminos para pagamento.
     */
    public void emitirBalancetesCondominos() {
        // Implementação para emitir os balancetes dos condôminos
    }

    /**
     * Gera os relatórios de contas anuais para os edifícios gerenciados pela empresa.
     */
    public void gerarRelatoriosContasAnuais() {
        // Implementação para gerar os relatórios de contas anuais
    }
}
