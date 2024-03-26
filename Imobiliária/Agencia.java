/**
 * Romeu Bernardo
 * A classe Agencia representa uma agência imobiliária.
 */
public class Agencia {
    private String nome;
    private String endereco;
    private Funcionario funcionarios[];
    private Imoveis imoveis[];
    private Venda vendas[];

    /**
     * Construtor da classe Agencia.
     * Cria uma instância de Agencia sem parâmetros.
     */
    public Agencia() {}

    /**
     * Construtor da classe Agencia.
     * Cria uma instância de Agencia com o nome e endereço especificados.
     * 
     * @param nome O nome da agência.
     * @param endereco O endereço da agência.
     */
    public Agencia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    /**
     * Obtém o nome da agência.
     * 
     * @return String O nome da agência.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Define o nome da agência.
     * 
     * @param nome O nome da agência a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o endereço da agência.
     * 
     * @return String O endereço da agência.
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * Define o endereço da agência.
     * 
     * @param endereco O endereço da agência a ser definido.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém a lista de funcionários da agência.
     * 
     * @return Funcionario[] A lista de funcionários da agência.
     */
    public Funcionario[] getFuncionarios() {
        return this.funcionarios;
    }

    /**
     * Define a lista de funcionários da agência.
     * 
     * @param funcionarios A lista de funcionários da agência a ser definida.
     */
    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    /**
     * Obtém a lista de imóveis da agência.
     * 
     * @return Imovel[] A lista de imóveis da agência.
     */
    public Imoveis[] getImoveis() {
        return this.imoveis;
    }

    /**
     * Define a lista de imóveis da agência.
     * 
     * @param imoveis A lista de imóveis da agência a ser definida.
     */
    public void setImoveis(Imoveis[] imoveis) {
        this.imoveis = imoveis;
    }

    /**
     * Obtém a lista de vendas realizadas pela agência.
     * 
     * @return Venda[] A lista de vendas realizadas pela agência.
     */
    public Venda[] getVendas() {
        return this.vendas;
    }

    /**
     * Define a lista de vendas realizadas pela agência.
     * 
     * @param vendas A lista de vendas realizadas pela agência a ser definida.
     */
    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
    }
}
