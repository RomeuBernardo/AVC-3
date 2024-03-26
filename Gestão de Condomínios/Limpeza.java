/**
 * Author: Romeu Bernardo
 * Classe que representa um funcionário de limpeza, que é um tipo específico de funcionário.
 */
public class Limpeza extends Funcionarios implements InterfaceFuncionario {
    
    /**
     * Construtor padrão da classe Limpeza.
     */
    public Limpeza() {}
    
    /**
     * Construtor da classe Limpeza.
     * @param nome Nome do funcionário de limpeza.
     * @param endereco Endereço do funcionário de limpeza.
     * @param email E-mail do funcionário de limpeza.
     * @param telefone Telefone do funcionário de limpeza.
     * @param salario Salário do funcionário de limpeza.
     */
    public Limpeza(String nome, String endereco, String email, int telefone, double salario) {
        super(nome, endereco, email, telefone, salario);
    }

    @Override
    public void realizarTarefas() {
        // Implementação para realizar tarefas específicas de um funcionário de limpeza
    }
}
