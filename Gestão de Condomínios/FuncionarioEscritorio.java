/**
 * Classe que representa um funcionário de escritório.
 */
public class FuncionarioEscritorio extends Funcionarios implements InterfaceFuncionario {
    public FuncionarioEscritorio(){
        super();
    }
    /**
     * Construtor da classe FuncionarioEscritorio.
     * @param nome Nome do funcionário.
     * @param endereco Endereço do funcionário.
     * @param email E-mail do funcionário.
     * @param telefone Telefone do funcionário.
     * @param salario Salário do funcionário.
     */
    public FuncionarioEscritorio(String nome, String endereco, String email, int telefone, double salario) {
        super(nome, endereco, email, telefone, salario);
    }

    @Override
    public void realizarTarefas() {
        // Implementação para realizar tarefas específicas de um funcionário de escritório
    }
}
