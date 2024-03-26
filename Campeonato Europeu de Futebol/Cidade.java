/**
 * Representa uma cidade onde um jogo pode ser realizado.
 */
public class Cidade {
    private String nome;
    private Estadio estadio;
    private int capacidadeEstadio;

    /**
     * Construtor sem parâmetros.
     */
    public Cidade() {}

    /**
     * Construtor com parâmetros.
     * 
     * @param nome Nome da cidade.
     * @param estadio Estádio da cidade.
     * @param capacidadeEstadio Capacidade do estádio da cidade.
     */
    public Cidade(String nome, Estadio estadio, int capacidadeEstadio) {
        this.nome = nome;
        this.estadio = estadio;
        this.capacidadeEstadio = capacidadeEstadio;
    }

    /**
     * Obtém o nome da cidade.
     * 
     * @return O nome da cidade.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da cidade.
     * 
     * @param nome O nome da cidade.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o estádio da cidade.
     * 
     * @return O estádio da cidade.
     */
    public Estadio getEstadio() {
        return estadio;
    }

    /**
     * Define o estádio da cidade.
     * 
     * @param estadio O estádio da cidade.
     */
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    /**
     * Obtém a capacidade do estádio da cidade.
     * 
     * @return A capacidade do estádio da cidade.
     */
    public int getCapacidadeEstadio() {
        return capacidadeEstadio;
    }

    /**
     * Define a capacidade do estádio da cidade.
     * 
     * @param capacidadeEstadio A capacidade do estádio da cidade.
     */
    public void setCapacidadeEstadio(int capacidadeEstadio) {
        this.capacidadeEstadio = capacidadeEstadio;
    }
}
