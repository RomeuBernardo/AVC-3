/**
 * Representa um estádio onde um jogo pode ser realizado.
 */
public class Estadio {
    private String nome;
    private int capacidade;
    private String localizacao;

    /**
     * Construtor sem parâmetros.
     */
    public Estadio() {}

    /**
     * Construtor com parâmetros.
     * 
     * @param nome Nome do estádio.
     * @param capacidade Capacidade do estádio.
     * @param localizacao Localização do estádio.
     */
    public Estadio(String nome, int capacidade, String localizacao) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
    }

    /**
     * Obtém o nome do estádio.
     * 
     * @return O nome do estádio.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do estádio.
     * 
     * @param nome O nome do estádio.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a capacidade do estádio.
     * 
     * @return A capacidade do estádio.
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Define a capacidade do estádio.
     * 
     * @param capacidade A capacidade do estádio.
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Obtém a localização do estádio.
     * 
     * @return A localização do estádio.
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * Define a localização do estádio.
     * 
     * @param localizacao A localização do estádio.
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}