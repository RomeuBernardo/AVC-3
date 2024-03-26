
/**
 * Author: Romeu Bernardo
 * Classe que representa um edifício gerenciado pela empresa de gestão de condomínios.
 */
public class Edificio {
    private String nome; // Nome do edifício
    private String endereco; // Endereço do edifício
    private Condomino []condominos; // Lista de condôminos do edifício
    public Edificio(){}
    /**
     * Construtor da classe Edificio.
     * @param nome Nome do edifício.
     * @param endereco Endereço do edifício.
     */
    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.condominos = new Condomino[10]; // Inicializa a lista de condôminos como uma LinkedList.
    }

    /**
     * Método para obter o nome do edifício.
     * @return Nome do edifício.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Método para definir o nome do edifício.
     * @param nome Nome do edifício.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o endereço do edifício.
     * @return Endereço do edifício.
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * Método para definir o endereço do edifício.
     * @param endereco Endereço do edifício.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Método para obter a lista de condôminos do edifício.
     * @return Lista de condôminos do edifício.
     */
    public Condomino[] getCondominos() {
        return this.condominos;
    }

    /**
     * Método para adicionar um condômino à lista de condôminos do edifício.
     * @param condomino Condômino a ser adicionado.
     */
    public void adicionarCondomino(Condomino condomino) {}

    /**
     * Método para remover um condômino da lista de condôminos do edifício.
     * @param condomino Condômino a ser removido.
     */
    public void removerCondomino(Condomino condomino) {}
}
