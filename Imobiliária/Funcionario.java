/**
 *  Author: Romeu Bernardo
 * A classe Funcionario representa um funcionário de uma agência imobiliária.
 * Herda atributos e métodos da classe Pessoa.
 */
public class Funcionario extends Pessoa {
    private int codigo;
    private Agencia agencia;
    private double salario;

    /**
     * Construtor padrão da classe Funcionario.
     * Cria uma instância de Funcionario sem parâmetros.
     */
    public Funcionario() {}

    /**
     * Construtor da classe Funcionario.
     * Cria uma instância de Funcionario com os parâmetros especificados.
     * 
     * @param nome O nome do funcionário.
     * @param endereco O endereço do funcionário.
     * @param email O email do funcionário.
     * @param telefone O telefone do funcionário.
     * @param password A senha do funcionário.
     * @param codigo O código do funcionário.
     * @param salario O salário do funcionário.
     * @param agencia A agência à qual o funcionário está associado.
     */
    public Funcionario(String nome, String endereco, String email, int telefone, String password, int codigo, double salario, Agencia agencia) {
        super(nome, endereco, email, telefone, password);
        this.codigo = codigo;
        this.salario = salario;
        this.agencia = agencia;
    }

    /**
     * Obtém o código do funcionário.
     * 
     * @return int O código do funcionário.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o código do funcionário.
     * 
     * @param codigo O código do funcionário a ser definido.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém a agência à qual o funcionário está associado.
     * 
     * @return Agencia A agência à qual o funcionário está associado.
     */
    public Agencia getAgencia() {
        return agencia;
    }

    /**
     * Define a agência à qual o funcionário está associado.
     * 
     * @param agencia A agência à qual o funcionário está associado a ser definida.
     */
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    /**
     * Obtém o salário do funcionário.
     * 
     * @return double O salário do funcionário.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o salário do funcionário.
     * 
     * @param salario O salário do funcionário a ser definido.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método de logout.
     * Implementação do método da classe Pessoa.
     */
    @Override
    public void logout() {}

    /**
     * Método de login.
     * Implementação do método da classe Pessoa.
     */
    @Override
    public void login() {}

    /**
     * Método de cadastro.
     * Implementação do método da classe Pessoa.
     */
    @Override
    public void cadastrar() {}
}
