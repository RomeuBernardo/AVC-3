/**
 * Representa um país.
 */
public class Pais {
    private String nome;
    private String bandeira;
    private String continente;

    /**
     * Construtor sem parâmetros.
     */
    public Pais() {}

    /**
     * Construtor com parâmetros.
     * 
     * @param nome Nome do país.
     * @param bandeira URL ou nome do arquivo da bandeira.
     * @param continente Continente ao qual o país pertence.
     */
    public Pais(String nome, String bandeira, String continente) {
        this.nome = nome;
        this.bandeira = bandeira;
        this.continente = continente;
    }

    /**
     * Obtém o nome do país.
     * 
     * @return O nome do país.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Define o nome do país.
     * 
     * @param nome O nome do país.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a URL ou o nome do arquivo da bandeira do país.
     * 
     * @return A URL ou o nome do arquivo da bandeira.
     */
    public String getBandeira() {
        return this.bandeira;
    }

    /**
     * Define a URL ou o nome do arquivo da bandeira do país.
     * 
     * @param bandeira A URL ou o nome do arquivo da bandeira.
     */
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    /**
     * Obtém o continente ao qual o país pertence.
     * 
     * @return O continente do país.
     */
    public String getContinente() {
        return this.continente;
    }

    /**
     * Define o continente ao qual o país pertence.
     * 
     * @param continente O continente do país.
     */
    public void setContinente(String continente) {
        this.continente = continente;
    }
}
