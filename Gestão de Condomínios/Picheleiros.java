/**
 * Classe que representa um picheleiro, que é um tipo específico de funcionário.
 */
public class Picheleiros extends Funcionarios implements InterfaceFuncionario {
    
    /**
     * Construtor padrão da classe Picheleiros.
     * Cria um picheleiro sem atributos específicos inicializados.
     */
    public Picheleiros() {}
    
    /**
     * Construtor da classe Picheleiros.
     * @param nome Nome do picheleiro.
     * @param endereco Endereço do picheleiro.
     * @param email E-mail do picheleiro.
     * @param telefone Telefone do picheleiro.
     * @param salario Salário do picheleiro.
     */
    public Picheleiros(String nome, String endereco, String email, int telefone, double salario) {
        super(nome, endereco, email, telefone, salario); // Chama o construtor da classe pai para inicializar os atributos comuns.
    }

    /**
     * Implementação do método para realizar tarefas específicas de um picheleiro.
     */
    @Override
    public void realizarTarefas() {
        // Implementação para realizar tarefas específicas de um picheleiro
    }
}
