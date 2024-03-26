/**
 *  Author: Romeu Bernardo
 * A classe Cliente representa um cliente do sistema imobiliário.
 * Herda atributos e métodos da classe Pessoa e implementa a interface InterfacePessoa.
 */
public class Cliente extends Pessoa implements InterfacePessoa {

    /**
     * Construtor padrão da classe Cliente.
     * Cria uma instância de Cliente sem parâmetros.
     */
    public Cliente() {}

    /**
     * Construtor da classe Cliente.
     * Cria uma instância de Cliente com os parâmetros especificados.
     * 
     * @param nome O nome do cliente.
     * @param endereco O endereço do cliente.
     * @param email O email do cliente.
     * @param telefone O telefone do cliente.
     * @param password A senha do cliente.
     */
    public Cliente(String nome, String endereco, String email, int telefone, String password) {
        super(nome, endereco, email, telefone, password);
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
     * Método para pesquisar imóveis disponíveis no sistema.
     */
    public void pesquisarImoveis() {}

    /**
     * Método para reservar um imóvel.
     */
    public void reservarImovel() {}

    /**
     * Método para efetuar a compra de um imóvel.
     */
    public void efectuarCompra() {}

    /**
     * Método para efetuar o aluguel de um imóvel.
     */
    public void efectuarAluguer() {}
}
