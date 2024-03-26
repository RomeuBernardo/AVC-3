/**
 * Author: Romeu Bernardo
 * Classe abstrata que representa um funcionário.
 * Herda os atributos e métodos da classe Pessoa.
 */
public abstract class Funcionarios extends Pessoa {
    protected double salario; // Salário do funcionário
    
    /**
     * Construtor padrão da classe Funcionarios.
     */
    public Funcionarios() {}
    
    /**
     * Construtor da classe Funcionarios.
     * @param nome Nome do funcionário.
     * @param endereco Endereço do funcionário.
     * @param email E-mail do funcionário.
     * @param telefone Telefone do funcionário.
     * @param salario Salário do funcionário.
     */
    public Funcionarios(String nome, String endereco, String email, int telefone, double salario) {
        super(nome, endereco, email, telefone); // Chama o construtor da classe pai Pessoa para inicializar os atributos comuns.
        this.salario = salario;
    }

    /**
     * Obtém o salário do funcionário.
     * @return O salário do funcionário.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o salário do funcionário.
     * @param salario O salário do funcionário.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método abstrato para realizar tarefas.
     * Este método deve ser implementado pelas subclasses.
     */
    public abstract void realizarTarefas();
}
