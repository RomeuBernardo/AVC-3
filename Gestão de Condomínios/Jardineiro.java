/**
 * Author: Romeu Bernardo
 * Classe que representa um jardineiro, que é um tipo específico de funcionário.
 */
public class Jardineiro extends Funcionarios implements InterfaceFuncionario {
    
    /**
     * Construtor padrão da classe Jardineiro.
     */
    public Jardineiro() {}
    
    /**
     * Construtor da classe Jardineiro.
     * @param nome Nome do jardineiro.
     * @param endereco Endereço do jardineiro.
     * @param email E-mail do jardineiro.
     * @param telefone Telefone do jardineiro.
     * @param salario Salário do jardineiro.
     */
    public Jardineiro(String nome, String endereco, String email, int telefone, double salario) {
        super(nome, endereco, email, telefone, salario);
    }

    @Override
    public void realizarTarefas() {
        // Implementação para realizar tarefas específicas de um jardineiro
    }

    /**
     * Método específico para manter o jardim.
     */
    public void manterJardim() {
        // Implementação para manter o jardim
    }
}
