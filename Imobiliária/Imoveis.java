/**
 * Author :Romeu Bernardo
 * A classe Imoveis representa um imóvel, contendo informações como ano de construção, localização, preço, tipologia e área.
 */
public class Imoveis {
    private int anoDeConstrucao;
    private String localizacao;
    private double preco;
    private String tipologia;
    private double area;

    /**
     * Construtor padrão da classe Imoveis.
     * Cria uma instância de Imoveis sem parâmetros.
     */
    public Imoveis() {}

    /**
     * Construtor da classe Imoveis.
     * Cria uma instância de Imoveis com os parâmetros especificados.
     * 
     * @param anoDeConstrucao O ano de construção do imóvel.
     * @param localizacao A localização do imóvel.
     * @param preco O preço do imóvel.
     * @param tipologia A tipologia do imóvel.
     * @param area A área do imóvel.
     */
    public Imoveis(int anoDeConstrucao, String localizacao, double preco, String tipologia, double area) {
        this.anoDeConstrucao = anoDeConstrucao;
        this.localizacao = localizacao;
        this.preco = preco;
        this.tipologia = tipologia;
        this.area = area;
    }

    /**
     * Obtém o ano de construção do imóvel.
     * 
     * @return int O ano de construção do imóvel.
     */
    public int getAnoDeConstrucao() {
        return this.anoDeConstrucao;
    }

    /**
     * Define o ano de construção do imóvel.
     * 
     * @param anoDeConstrucao O ano de construção do imóvel a ser definido.
     */
    public void setAnoDeConstrucao(int anoDeConstrucao) {
        this.anoDeConstrucao = anoDeConstrucao;
    }

    /**
     * Obtém a localização do imóvel.
     * 
     * @return String A localização do imóvel.
     */
    public String getLocalizacao() {
        return this.localizacao;
    }

    /**
     * Define a localização do imóvel.
     * 
     * @param localizacao A localização do imóvel a ser definida.
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    /**
     * Obtém o preço do imóvel.
     * 
     * @return double O preço do imóvel.
     */
    public double getPreco() {
        return this.preco;
    }

    /**
     * Define o preço do imóvel.
     * 
     * @param preco O preço do imóvel a ser definido.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Obtém a tipologia do imóvel.
     * 
     * @return String A tipologia do imóvel.
     */
    public String getTipologia() {
        return this.tipologia;
    }

    /**
     * Define a tipologia do imóvel.
     * 
     * @param tipologia A tipologia do imóvel a ser definida.
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    /**
     * Obtém a área do imóvel.
     * 
     * @return double A área do imóvel.
     */
    public double getArea() {
        return this.area;
    }

    /**
     * Define a área do imóvel.
     * 
     * @param area A área do imóvel a ser definida.
     */
    public void setArea(double area) {
        this.area = area;
    }
}
