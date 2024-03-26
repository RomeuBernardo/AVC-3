/**
 * Author: ROmeu Bernardo
 * A classe Proprietario representa um proprietário de imóveis.
 * Herda atributos e métodos da classe Pessoa e implementa a interface InterfacePessoa.
 */
public class Proprietario extends Pessoa implements InterfacePessoa {
    private Imoveis imoveis;

    /**
     * Construtor padrão da classe Proprietario.
     * Cria uma instância de Proprietario sem parâmetros.
     */
    public Proprietario() {}

    /**
     * Construtor da classe Proprietario.
     * Cria uma instância de Proprietario com os parâmetros especificados.
     * 
     * @param nome Nome do proprietário.
     * @param endereco Endereço do proprietário.
     * @param email E-mail do proprietário.
     * @param telefone Telefone do proprietário.
     * @param password Senha do proprietário.
     * @param imoveis Imóveis associados ao proprietário.
     */
    public Proprietario(String nome, String endereco, String email, int telefone, String password, Imoveis imoveis) {
        super(nome, endereco, email, telefone, password);
        this.imoveis = imoveis;
    }

    /**
     * Define os imóveis associados ao proprietário.
     * 
     * @param imoveis Imóveis associados ao proprietário.
     */
    public void setImoveis(Imoveis imoveis) {
        this.imoveis = imoveis;
    }

    /**
     * Obtém os imóveis associados ao proprietário.
     * 
     * @return Imoveis Imóveis associados ao proprietário.
     */
    public Imoveis getImoveis() {
        return this.imoveis;
    }

    /**
     * Método de logout.
     * Implementação do método da interface InterfacePessoa.
     */
    @Override
    public void logout() {}

    /**
     * Método de login.
     * Implementação do método da interface InterfacePessoa.
     */
    @Override
    public void login() {}

    /**
     * Método de cadastro.
     * Implementação do método da interface InterfacePessoa.
     */
    @Override
    public void cadastrar() {}

    /**
     * Método para pesquisar os imóveis do proprietário.
     */
    public void pesquisarImoveis() {}

    /**
     * Método para solicitar registro de um imóvel.
     */
    public void solicitarRegistro() {}

    /**
     * Método para adicionar um novo imóvel.
     */
    public void adicionarImovel() {}
}
