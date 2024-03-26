/**
 * Author: Romeu Bernardo
 * Classe que representa os dados financeiros associados a uma descrição e um valor.
 */
public class DadosFinanceiros {
    private String descricao; // Descrição dos dados financeiros
    private double valor; // Valor associado aos dados financeiros
    
    /**
     * Construtor padrão da classe DadosFinanceiros.
     */
    public DadosFinanceiros() {}
    
    /**
     * Obtém a descrição dos dados financeiros.
     * @return A descrição dos dados financeiros.
     */
    public String getDescricao() {
        return this.descricao;
    }
    
    /**
     * Obtém o valor associado aos dados financeiros.
     * @return O valor associado aos dados financeiros.
     */
    public double getValor() {
        return this.valor;
    }
    
    /**
     * Define a descrição dos dados financeiros.
     * @param descricao A descrição dos dados financeiros.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * Define o valor associado aos dados financeiros.
     * @param valor O valor associado aos dados financeiros.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
