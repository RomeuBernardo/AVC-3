/**
 * Author: Romeu Bernardo
 * Classe que representa um condômino em um edifício gerenciado pela empresa de gestão de condomínios.
 * Herda os atributos e métodos da classe Pessoa.
 */
public class Condomino extends Pessoa {
    private double quotaMensal; // Quota mensal do condômino

    public Condomino(){}
    /**
     * Construtor da classe Condomino.
     * @param nome Nome do condômino.
     * @param endereco Endereço do condômino.
     * @param email E-mail do condômino.
     * @param telefone Telefone do condômino.
     * @param quotaMensal Quota mensal do condômino.
     */
    public Condomino(String nome, String endereco, String email, int telefone, double quotaMensal) {
        super(nome, endereco, email, telefone); // Chama o construtor da classe pai Pessoa para inicializar os atributos comuns.
        this.quotaMensal = quotaMensal;
    }

    /**
     * Método para consultar as informações individuais do condômino.
     * Aqui você pode adicionar a lógica para consultar informações específicas do condômino.
     */
    public void consultarInformacoesIndividuais() {
        // Implementação para consultar informações individuais do condômino.
    }

    /**
     * Método para obter a quota mensal do condômino.
     * @return Quota mensal do condômino.
     */
    public double getQuotaMensal() {
        return quotaMensal;
    }

    /**
     * Método para definir a quota mensal do condômino.
     * @param quotaMensal Quota mensal do condômino.
     */
    public void setQuotaMensal(double quotaMensal) {
        this.quotaMensal = quotaMensal;
    }
}
